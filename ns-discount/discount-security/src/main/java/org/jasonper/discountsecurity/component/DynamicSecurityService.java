package org.jasonper.discountsecurity.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/10 16:54
 * @description 动态权限相关业务类
 */
public interface DynamicSecurityService {

    /**
     * 加载资源ANT通配符和资源对应Map
     * @return
     */
    Map<String, ConfigAttribute> loadDataSource();
}
