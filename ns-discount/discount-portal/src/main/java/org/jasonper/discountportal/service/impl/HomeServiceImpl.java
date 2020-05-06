package org.jasonper.discountportal.service.impl;

import com.github.pagehelper.PageHelper;
import org.jasonper.discountmbg.mapper.GameBasesMapper;
import org.jasonper.discountmbg.mapper.GameInfosMapper;
import org.jasonper.discountmbg.mapper.GameScoresMapper;
import org.jasonper.discountmbg.mapper.PlayerGameRemindsMapper;
import org.jasonper.discountmbg.model.*;
import org.jasonper.discountportal.dao.HomeDao;
import org.jasonper.discountportal.domain.*;
import org.jasonper.discountportal.repository.GameDiscountRepository;
import org.jasonper.discountportal.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/30 16:31
 * @description 首页内容管理Service实现类
 */
@Service
public class HomeServiceImpl implements HomeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeServiceImpl.class);
    @Autowired
    private GameInfosMapper gameInfosMapper;
    @Autowired
    private GameBasesMapper gameBasesMapper;
    @Autowired
    private GameDiscountRepository gameDiscountRepository;
    @Autowired
    private HomeDao homeDao;
    @Autowired
    private GameScoresMapper gameScoresMapper;
    @Autowired
    private PlayerGameRemindsMapper playerGameRemindsMapper;

    @Override
    public List<CarouseSimple> getCarouselList() {
        List<GameInfos> gameInfosList = getAllGameInfos();
        List<CarouseSimple> carouseSimpleList = new ArrayList<>();
        if (gameInfosList != null){
            for (GameInfos item: gameInfosList) {
                CarouseSimple simple = new CarouseSimple();

                simple.setId(item.getId());
                simple.setInfoName(item.getInfoName());
                simple.setInfoUrl(item.getInfoUrl());
                simple.setCreateTime(item.getCreateTime());

                carouseSimpleList.add(simple);
            }
        }
        return carouseSimpleList;
    }

    @Override
    public GameInfos getCarouseDetail(Long id) {
        List<GameInfos> gameInfosList = getAllGameInfos();
        if (gameInfosList != null){
            for (GameInfos item : gameInfosList){
                if (item.getId().equals(id)){
                    return item;
                }
            }
        }
        return null;
    }

    @Override
    public Page<GameDiscount> getGameDiscountList(Integer pageSize, Integer pageNum) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return gameDiscountRepository.findAll(pageable);
    }

    @Override
    public List<GameInfoSimple> searchGamesByName(String name) {
        return getGameDetailsByKeyWord(name);
    }

    @Override
    public GameInfoDetail getGameInfoDetailsByGameId(Long gameId) {
        GameInfoDetail gameInfoDetail = homeDao.getGameInfoDetailsByGameId(gameId);
        if (gameInfoDetail != null){
            return gameInfoDetail;
        }
        return null;
    }

    @Override
    public GameInfoDetail getGameInfoDetailsByGameCode(Long gameCode) {
        GameInfoDetail gameInfoDetail = homeDao.getGameInfoDetailsByGameCode(gameCode);
        if (gameInfoDetail != null){
            return gameInfoDetail;
        }
        return null;
    }

    @Override
    public List<GameAssess> getGameAssessByGameId(Long gameId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<GameAssess> gameAssessList = homeDao.getGameAssessByGameId(gameId);
        if (gameAssessList != null){
            return gameAssessList;
        }
        return null;
    }

    @Override
    public int addGameAccess(GameScores gameScores) {
        gameScores.setCreateTime(new Date());
        int code;
        try{
            code = gameScoresMapper.insert(gameScores);
        }catch (Exception e){
            code = 0;
            LOGGER.info("新建游戏评价失败:{}", e.getMessage());
        }
        return code;
    }

    @Override
    public int addPriceRemind(PlayerGameReminds remind) {
        remind.setCreateTime(new Date());
        int code;
        try {
            code = playerGameRemindsMapper.insert(remind);
        }catch (Exception e){
            code = 0;
            LOGGER.info("加入愿望单失败:{}", e.getMessage());
        }
        return code;
    }

    private List<GameInfos> getAllGameInfos(){
        GameInfosExample example = new GameInfosExample();
        example.createCriteria().andStatusEqualTo(1);
        List<GameInfos> gameInfosList = gameInfosMapper.selectByExampleWithBLOBs(example);
        if (!gameInfosList.isEmpty()){
            return gameInfosList;
        }
        return null;
    }

    private List<GameInfoSimple> getGameDetailsByKeyWord(String name){
        GameBasesExample example = new GameBasesExample();
        example.createCriteria().andNameEnLike("%"+name+"%");
        example.or(example.createCriteria().andNameZhLike("%"+name+"%"));

        List<GameBases> gameBasesList = gameBasesMapper.selectByExampleWithBLOBs(example);

        List<GameDiscount> gameDiscountList = gameDiscountRepository.findAll();

        List<GameInfoSimple> gameInfoSimpleList = new ArrayList<>();

        if (gameBasesList != null){
            for (GameBases item:gameBasesList) {
                GameInfoSimple details = new GameInfoSimple();
                details.setId(item.getId());
                details.setNameZh(item.getNameZh());
                details.setNameEn(item.getNameEn());
                details.setImg(item.getCoverUrl());

                for (int i = 0; i < gameDiscountList.size(); i++) {
                    if (item.getCode().equals(gameDiscountList.get(i).getCode())){
                        details.setSale(gameDiscountList.get(i).getSale());
                        details.setRegion(gameDiscountList.get(i).getRegion());
                        details.setPrice(gameDiscountList.get(i).getPrice());

                        break;
                    }
                }

                gameInfoSimpleList.add(details);
            }
            return gameInfoSimpleList;
        }
        return null;
    }
}
