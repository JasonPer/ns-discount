package org.jasonper.discountportal.service;

import org.jasonper.discountmbg.model.GameInfos;
import org.jasonper.discountmbg.model.GameScores;
import org.jasonper.discountmbg.model.PlayerGameReminds;
import org.jasonper.discountportal.domain.*;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/30 16:21
 * @description 首页内容管理Service
 */
public interface HomeService {

    /**
     * 获取首页轮播广告
     * @return
     */
    List<CarouseSimple> getCarouselList();

    /**
     * 获取广告详情
     * @param id 广告id
     * @return
     */
    GameInfos getCarouseDetail(Long id);

    /**
     * 分页获取游戏折扣信息
     * @param pageSize
     * @param pageNum
     * @return
     */
    Page<GameDiscount> getGameDiscountList(Integer pageSize, Integer pageNum);

    /**
     * 按游戏名字关键字模糊查询简单游戏信息
     * @param name
     * @return
     */
    List<GameInfoSimple> searchGamesByName(String name);

    /**
     * 按照id获取游戏信息详情
     * @param gameId
     * @return
     */
    GameInfoDetail getGameInfoDetailsByGameId(Long gameId);

    /**
     * 按照code获取游戏信息详情
     * @param gameCode
     * @return
     */
    GameInfoDetail getGameInfoDetailsByGameCode(Long gameCode);

    /**
     * 按照id获取游戏下玩家的评价
     * @param gameId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<GameAssess> getGameAssessByGameId(Long gameId, Integer pageSize, Integer pageNum);

    /**
     * 玩家新建游戏评价
     * @param gameScores
     * @return
     */
    int addGameAccess(GameScores gameScores);

    /**
     * 加入降价提醒
     * @param remind
     * @return
     */
    int addPriceRemind(PlayerGameReminds remind);
}
