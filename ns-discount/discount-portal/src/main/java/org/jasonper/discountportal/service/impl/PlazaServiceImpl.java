package org.jasonper.discountportal.service.impl;

import com.github.pagehelper.PageHelper;
import org.jasonper.discountmbg.mapper.*;
import org.jasonper.discountmbg.model.*;
import org.jasonper.discountportal.dao.PlazaDao;
import org.jasonper.discountportal.domain.PostDetail;
import org.jasonper.discountportal.domain.PostSimple;
import org.jasonper.discountportal.domain.TopGame;
import org.jasonper.discountportal.service.PlazaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/1 19:37
 * @description 游戏广场Service实现类
 */
@Service
public class PlazaServiceImpl implements PlazaService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlazaServiceImpl.class);
    @Autowired
    private GameInHotMapper inHotMapper;
    @Autowired
    private GameBasesMapper gameBasesMapper;
    @Autowired
    private PlazaDao plazaDao;
    @Autowired
    private PlayerPostsMapper playerPostsMapper;
    @Autowired
    private PlayerCommentsMapper playerCommentsMapper;
    @Autowired
    private PlayerReplysMapper playerReplysMapper;
    @Autowired
    private ReportPostsMapper reportPostsMapper;

    @Override
    public List<TopGame> getTopGames() {
        List<GameInHot> inHotList = inHotMapper.selectByExample(null);

        List<TopGame> topGameList = new ArrayList<>();

        if (inHotList != null){
            for (GameInHot item:inHotList) {
                GameBases bases = gameBasesMapper.selectByPrimaryKey(item.getGameBaseId());
                TopGame topGame = new TopGame();

                topGame.setGameId(item.getGameBaseId());
                topGame.setNameZh(bases.getNameZh());
                topGame.setIgn(bases.getIgn());
                topGame.setCoverUrl(bases.getCoverUrl());

                topGameList.add(topGame);
            }
            return topGameList;
        }
        return null;
    }

    @Override
    public List<TopGame> searchGameCommunity(String gameName) {
        String name = "%" + gameName +"%";
        List<TopGame> gameCommunity = plazaDao.getGameCommunityByGameName(name);
        return gameCommunity;
    }

    @Override
    public List<PostSimple> getPlayerPostsList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<PostSimple> postSimpleList = plazaDao.getPostSimpleList();
        if (postSimpleList != null){
            return postSimpleList;
        }
        return null;
    }

    @Override
    public List<PostSimple> getPlayerPostsListByGameId(Long gameId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<PostSimple> postSimpleList = plazaDao.getPostSimpleListByGameId(gameId);
        if (postSimpleList != null){
            return postSimpleList;
        }
        return null;
    }

    @Override
    public List<PostDetail> getPostDetailListByPostId(Long postId, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        List<PostDetail> postDetailList = plazaDao.getPostDetailListByPostId(postId);
        if (postDetailList != null){
            return postDetailList;
        }
        return null;
    }

    @Override
    public int addPlayerPost(PlayerPosts posts) {
        posts.setCreateTime(new Date());
        int code;
        try {
            code = playerPostsMapper.insert(posts);
        }catch (Exception e){
            code = 0;
            LOGGER.info("新建帖子失败:{}", e.getMessage());
        }
        return code;
    }

    @Override
    public int addPlayerComment(PlayerComments comment) {
        comment.setCreateTime(new Date());
        int code;
        try{
            code = playerCommentsMapper.insert(comment);
        }catch (Exception e){
            code = 0;
            LOGGER.info("新建评论失败:{}", e.getMessage());
        }
        return code;
    }

    @Override
    public int addPlayerReply(PlayerReplys reply) {
        reply.setCreateTime(new Date());
        int code;
        try{
            code = playerReplysMapper.insert(reply);
        }catch (Exception e){
            code = 0;
            LOGGER.info("新建回复失败:{}", e.getMessage());
        }
        return code;
    }

    @Override
    public int addPostReport(ReportPosts report) {
        report.setCreateTime(new Date());
        int code;
        try {
            code = reportPostsMapper.insert(report);
        }catch (Exception e){
            code = 0;
            LOGGER.info("新建举报失败:{}", e.getMessage());
        }
        return code;
    }

    @Override
    public List<PlayerPosts> searchPlayerPost(String keyWord) {
        PlayerPostsExample example = new PlayerPostsExample();
        example.createCriteria().andThemeLike("%"+keyWord+"%");
        List<PlayerPosts> playerPosts = playerPostsMapper.selectByExample(example);

        if (playerPosts.size() > 0){
            return playerPosts;
        }
        return null;
    }


}
