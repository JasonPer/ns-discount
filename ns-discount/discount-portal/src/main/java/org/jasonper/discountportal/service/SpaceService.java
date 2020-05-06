package org.jasonper.discountportal.service;

import org.jasonper.discountportal.domain.GameInfoSimple;
import org.jasonper.discountportal.domain.PlayerInfo;
import org.jasonper.discountportal.domain.PostCollection;
import org.jasonper.discountportal.domain.PostLiked;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/5 18:53
 * @description 个人空间Service
 */
public interface SpaceService {
    /**
     * 根据玩家id修改玩家头像
     * @param playerId
     * @return
     */
    int updateAvatarByPlayerId(Long playerId, String avatar);

    /**
     * 完善玩家基本信息
     * @param info
     * @return
     */
    int updatePlayerInfo(PlayerInfo info);

    /**
     * 获取玩家的心愿单
     * @param playerId
     * @return
     */
    List<GameInfoSimple> getPlayerRemain(Long playerId);

    /**
     * 获取玩家收藏帖子
     * @param playerId
     * @return
     */
    List<PostCollection> getPostCollection(Long playerId);

    /**
     * 获取玩家点赞帖子
     * @param playerId
     * @return
     */
    List<PostLiked> getPostLiked(Long playerId);

    /**
     * 获取玩家积分
     * @param playerId
     * @return
     */
    String getPlayerIntegral(Long playerId);
}
