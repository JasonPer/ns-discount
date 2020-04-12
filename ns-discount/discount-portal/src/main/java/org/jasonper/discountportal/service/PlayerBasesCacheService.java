package org.jasonper.discountportal.service;

import org.jasonper.discountmbg.model.PlayerBases;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 9:55
 * @description 玩家信息缓存Service
 */
public interface PlayerBasesCacheService {
    /**
     *删除玩家缓存
     * @param playerId
     */
    void delPlayer(Long playerId);

    /**
     *获取玩家缓存
     * @param playerName
     * @return
     */
    PlayerBases getPlayer(String playerName);

    /**
     * 设置玩家缓存
     * @param player
     */
    void setPlayer(PlayerBases player);

    /**
     * 设置验证码
     * @param phone
     * @param authCode
     */
    void setAuthCode(String phone, String authCode);

    /**
     * 获取验证码
     * @param phone
     * @return
     */
    String getAuthCode(String phone);

}
