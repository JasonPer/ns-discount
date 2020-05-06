package org.jasonper.discountadmin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasonper.discountadmin.service.UmsResourceService;
import org.jasonper.discountcommon.api.CommonPage;
import org.jasonper.discountcommon.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/6 13:18
 * @description
 */
@Controller
@Api(tags = "HomeController", description = "首页信息管理")
@RequestMapping("/admin/info")
public class TestController {
    @Autowired
    private UmsResourceService resourceService;

    @ApiOperation("首页轮播图列表")
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCarouselList(){
       return CommonResult.success(resourceService.listAll());
    }
}
