package org.jasonper.discountportal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasonper.discountcommon.api.CommonPage;
import org.jasonper.discountcommon.api.CommonResult;
import org.jasonper.discountmbg.model.GameInfos;
import org.jasonper.discountmbg.model.GameScores;
import org.jasonper.discountmbg.model.PlayerGameReminds;
import org.jasonper.discountportal.domain.*;
import org.jasonper.discountportal.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/30 16:48
 * @description 首页信息管理Controller
 */
@Controller
@Api(tags = "HomeController", description = "首页信息管理")
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private HomeService homeService;

    @ApiOperation("首页轮播图列表")
    @RequestMapping(value = "/show/getCarouselList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getCarouselList(){
        List<CarouseSimple> carouseSimpleList = homeService.getCarouselList();
        return CommonResult.success(CommonPage.restPage(carouseSimpleList));
    }

    @ApiOperation("首页轮播详情")
    @RequestMapping(value = "/show/getCarouselDetail", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getCarouseDetail(@RequestParam Long id){
        GameInfos gameInfo = homeService.getCarouseDetail(id);
        return CommonResult.success(gameInfo);
    }

    @ApiOperation("首页打折游戏列表")
    @RequestMapping(value = "/show/getGameDiscountList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getGameDiscountList(@RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                            @RequestParam(required = false, defaultValue = "12") Integer pageSize){
        Page<GameDiscount> gameDiscountList = homeService.getGameDiscountList(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(gameDiscountList));
    }

    @ApiOperation("首页搜索游戏")
    @RequestMapping(value = "/show/searchGamesByName", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult searchGamesByName(@RequestParam String name){
        List<GameInfoSimple> gameInfoSimpleList = homeService.searchGamesByName(name);
        return CommonResult.success(CommonPage.restPage(gameInfoSimpleList));
    }

    @ApiOperation("首页获取游戏信息详情:通过游戏id")
    @RequestMapping(value = "/show/getGameInfoDetailById", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getGameInfoDetailsByGameId(@RequestParam Long gameId){
        GameInfoDetail gameInfoSimpleList = homeService.getGameInfoDetailsByGameId(gameId);
        return CommonResult.success(gameInfoSimpleList);
    }

    @ApiOperation("首页获取游戏信息详情:通过游戏code")
    @RequestMapping(value = "/show/getGameInfoDetailByCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getGameInfoDetailsByGameCode(@RequestParam Long gameCode){
        GameInfoDetail gameInfoSimpleList = homeService.getGameInfoDetailsByGameCode(gameCode);
        return CommonResult.success(gameInfoSimpleList);
    }

    @ApiOperation("游戏下所有玩家评价详情")
    @RequestMapping(value = "/show/getGameAssess", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getGameAssess(@RequestParam Long gameId,
                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                      @RequestParam(required = false, defaultValue = "12") Integer pageSize){
        List<GameAssess> gameAssessList = homeService.getGameAssessByGameId(gameId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(gameAssessList));
    }

    @ApiOperation("玩家评价游戏")
    @RequestMapping(value = "/operate/addGameAssess", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addGameAssess(@RequestBody GameScores gameScores){
        int count = homeService.addGameAccess(gameScores);
        if (count >0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("加入降价提醒")
    @RequestMapping(value = "/operate/addRemind", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addRemind(@RequestBody PlayerGameReminds remind){
        int code = homeService.addPriceRemind(remind);
        return CommonResult.success(code);
    }

}
