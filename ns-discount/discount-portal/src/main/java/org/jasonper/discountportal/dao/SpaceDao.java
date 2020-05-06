package org.jasonper.discountportal.dao;

import org.jasonper.discountportal.domain.GameRemind;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/5 19:25
 * @description
 */
public interface SpaceDao {
    /**
     * 根据玩家id获取愿望单
     * @param playerId
     * @return
     */
    List<GameRemind> getPlayerRemainByPlayerId(Long playerId);
}
