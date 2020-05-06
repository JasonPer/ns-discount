package org.jasonper.discountportal.service.impl;

import org.jasonper.discountmbg.mapper.PlayerBasesMapper;
import org.jasonper.discountmbg.model.PlayerBases;
import org.jasonper.discountportal.dao.SpaceDao;
import org.jasonper.discountportal.domain.*;
import org.jasonper.discountportal.repository.GameDiscountRepository;
import org.jasonper.discountportal.repository.PostCollectionRepository;
import org.jasonper.discountportal.repository.PostLikedRepository;
import org.jasonper.discountportal.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/5 19:00
 * @description 个人中心Service实现类
 */
@Service
public class SpaceServiceImpl implements SpaceService {
    @Autowired
    private PlayerBasesMapper playerBasesMapper;
    @Autowired
    private SpaceDao spaceDao;
    @Autowired
    private GameDiscountRepository gameDiscountRepository;
    @Autowired
    private PostCollectionRepository postCollectionRepository;
    @Autowired
    private PostLikedRepository postLikedRepository;

    @Override
    public int updateAvatarByPlayerId(Long playerId, String avatar) {
        PlayerBases playerBase = playerBasesMapper.selectByPrimaryKey(playerId);
        int code = 0;
        if (playerBase != null){
            playerBase.setAvatar(avatar);
            code = playerBasesMapper.updateByPrimaryKey(playerBase);
        }
        return code;
    }

    @Override
    public int updatePlayerInfo(PlayerInfo info) {
        PlayerBases playerBase = playerBasesMapper.selectByPrimaryKey(info.getId());
        int code = 0;
        if (playerBase != null){
            playerBase.setPlayerName(info.getPlayerName());
            playerBase.setEmail(info.getEmail());

            code = playerBasesMapper.updateByPrimaryKey(playerBase);
        }
        return code;
    }

    @Override
    public List<GameInfoSimple> getPlayerRemain(Long playerId) {
        return getGameRemainByPlayerId(playerId);
    }

    @Override
    public List<PostCollection> getPostCollection(Long playerId) {
        return postCollectionRepository.findByFromPlayerId(playerId);
    }

    @Override
    public List<PostLiked> getPostLiked(Long playerId) {
        return postLikedRepository.findByFromPlayerId(playerId);
    }

    @Override
    public String getPlayerIntegral(Long playerId) {
        PlayerBases bases = playerBasesMapper.selectByPrimaryKey(playerId);
        if (bases != null){
            return bases.getIntegral();
        }
        return null;
    }

    private List<GameInfoSimple> getGameRemainByPlayerId(Long playerId) {
        List<GameRemind> gameReminds = spaceDao.getPlayerRemainByPlayerId(playerId);

        List<GameDiscount> gameDiscountList = gameDiscountRepository.findAll();

        List<GameInfoSimple> gameInfoSimpleList = new ArrayList<>();

        if (gameReminds != null){
            for (GameRemind item : gameReminds) {
                GameInfoSimple details = new GameInfoSimple();
                details.setId(item.getId());
                details.setNameZh(item.getNameZh());
                details.setNameEn(item.getNameEn());
                details.setImg(item.getImg());

                for (int i = 0; i < gameDiscountList.size(); i++) {
                    if (item.getCode().equals(gameDiscountList.get(i).getCode())) {
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
