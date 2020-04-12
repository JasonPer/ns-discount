package org.jasonper.discountportal.service;

import org.jasonper.discountmbg.model.PlayerBases;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 9:32
 * @description 玩家信息管理Service
 */
public interface PlayerBasesService {
    /**
     *根据玩家用户名获取玩家信息
     * @param playerName
     * @return
     */
    PlayerBases getByPlayerName(String playerName);

    /**
     *根据玩家编号获取玩家信息
     * @param id
     * @return
     */
    PlayerBases getById(Long id);

    /**
     * 玩家注册
     * @param playerName 用户名
     * @param password 密码
     * @param phone 手机号
     * @param authCode 验证码
     */
    @Transactional
    void register(String playerName, String password, String phone, String authCode);

    /**
     * 生成验证码
     * @param phone
     * @return
     */
    String generateAuthCode(String phone);

    /**
     * 修改密码
     * @param phone 手机号
     * @param password 新密码
     * @param authCode 验证码
     */
    @Transactional
    void updatePassword(String phone, String password, String authCode);

    /**
     * 获取当前登陆玩家
     * @return
     */
    PlayerBases getCurrentPlayer();

    /**
     *根据玩家id修改玩家积分
     * @param id
     * @param integration
     */
    void updateIntegration(Long id,Integer integration);

    /**
     *登录后获取token
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 刷新token
     * @param token
     * @return
     */
    String refreshToken(String token);
}
