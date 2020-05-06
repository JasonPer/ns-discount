package org.jasonper.discountadmin.service.impl;

import org.jasonper.discountadmin.service.UmsResourceService;
import org.jasonper.discountmbg.mapper.UmsResourceMapper;
import org.jasonper.discountmbg.model.UmsResource;
import org.jasonper.discountmbg.model.UmsResourceExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/6 12:54
 * @description
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {
    @Autowired
    private UmsResourceMapper resourceMapper;
    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }
}
