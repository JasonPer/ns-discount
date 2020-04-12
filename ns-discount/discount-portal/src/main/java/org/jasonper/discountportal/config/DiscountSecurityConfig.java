package org.jasonper.discountportal.config;

import org.jasonper.discountsecurity.config.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 11:02
 * @description discount-security模块相关配置
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DiscountSecurityConfig extends SecurityConfig {
    @Autowired
    private UserDetailsService playerBasesService;

    public UserDetailsService userDetailsService(){
        //获取登录用户信息
        return playerName -> playerBasesService.loadUserByUsername(playerName);
    }

}
