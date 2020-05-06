package org.jasonper.discountadmin.dao;

import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.UmsAdminRoleRelation;
import org.jasonper.discountmbg.model.UmsResource;
import org.jasonper.discountmbg.model.UmsRole;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/6 12:48
 * @description
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);
    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 获取资源相关用户ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
