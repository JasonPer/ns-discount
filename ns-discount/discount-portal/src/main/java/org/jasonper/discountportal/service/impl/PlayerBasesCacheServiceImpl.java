package org.jasonper.discountportal.service.impl;

import org.jasonper.discountmbg.mapper.PlayerBasesMapper;
import org.jasonper.discountmbg.model.PlayerBases;
import org.jasonper.discountportal.service.PlayerBasesCacheService;
import org.jasonper.discountsecurity.annotation.CacheException;
import org.jasonper.discountsecurity.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 10:00
 * @description 玩家信息缓存Service实现类
 */
@Service
public class PlayerBasesCacheServiceImpl implements PlayerBasesCacheService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private PlayerBasesMapper basesMapper;

    // Redis相关设置
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.expire.authCode}")
    private Long REDIS_EXPIRE_AUTH_CODE;
    @Value("${redis.key.player}")
    private String REDIS_KEY_PLAYER;
    @Value("${redis.key.authCode}")
    private String REDIS_KEY_AUTH_CODE;

    @Override
    public void delPlayer(Long playerId) {
        PlayerBases playerBases = basesMapper.selectByPrimaryKey(playerId);
        if (playerBases != null){
            String key = REDIS_DATABASE + ":" + REDIS_KEY_PLAYER + ":" + playerBases.getPlayerName();
            redisService.del(key);
        }
    }

    @Override
    public PlayerBases getPlayer(String playerName) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_PLAYER + ":" + playerName;
        return (PlayerBases) redisService.get(key);
    }

    @Override
    public void setPlayer(PlayerBases player) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_PLAYER + ":" + player.getPlayerName();
        redisService.set(key, player, REDIS_EXPIRE);
    }

    @CacheException
    @Override
    public void setAuthCode(String phone, String authCode) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + phone;
        redisService.set(key, authCode, REDIS_EXPIRE_AUTH_CODE);
    }

    @CacheException
    @Override
    public String getAuthCode(String phone) {
        String key = REDIS_DATABASE + ":" + REDIS_KEY_AUTH_CODE + ":" + phone;
        return (String) redisService.get(key);
    }
}
