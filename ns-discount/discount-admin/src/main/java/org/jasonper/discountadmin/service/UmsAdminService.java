package org.jasonper.discountadmin.service;

import org.jasonper.discountmbg.model.UmsAdmin;
import org.jasonper.discountmbg.model.UmsResource;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/6 12:36
 * @description
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 根据用户id获取用户
     */
    UmsAdmin getItem(Long id);

    /**
     * 获取指定用户的可访问资源
     */
    List<UmsResource> getResourceList(Long adminId);
    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);
}
