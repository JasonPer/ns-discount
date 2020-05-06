package org.jasonper.discountportal.domain;

import org.jasonper.discountmbg.model.PlayerBases;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 10:42
 * @description 玩家详情封装
 */
public class PlayerDetail implements UserDetails {
    private PlayerBases playerBases;

    public PlayerDetail(PlayerBases playerBases) {
        this.playerBases = playerBases;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return Arrays.asList(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getPassword() {
        return playerBases.getPassword();
    }

    @Override
    public String getUsername() {
        return playerBases.getPlayerName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return playerBases.getStatus()==1;
    }

    public PlayerBases getPlayerBases() {
        return playerBases;
    }
}
