package org.jasonper.discountadmin.service;

import org.jasonper.discountmbg.model.UmsResource;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/6 12:36
 * @description
 */
public interface UmsResourceService {
    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();
}
