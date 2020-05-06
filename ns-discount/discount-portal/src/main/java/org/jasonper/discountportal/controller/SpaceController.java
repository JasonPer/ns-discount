package org.jasonper.discountportal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasonper.discountcommon.api.CommonResult;
import org.jasonper.discountportal.domain.GameInfoSimple;
import org.jasonper.discountportal.domain.PlayerInfo;
import org.jasonper.discountportal.domain.PostCollection;
import org.jasonper.discountportal.domain.PostLiked;
import org.jasonper.discountportal.service.SpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/5 19:11
 * @description 个人中心Controller
 */
@Controller
@Api(tags = "SpaceController", description = "个人中心管理")
@RequestMapping("/space")
public class SpaceController {
    @Autowired
    private SpaceService spaceService;

    @ApiOperation("修改玩家头像")
    @RequestMapping(value = "/avatar", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateAvatarByPlayerId(@RequestParam Long playerId, @RequestParam String imageUrl){
        int result = spaceService.updateAvatarByPlayerId(playerId, imageUrl);
        return CommonResult.success(result);
    }

    @ApiOperation("修改玩家信息")
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePlayerInfo(@RequestBody PlayerInfo info){
        int result = spaceService.updatePlayerInfo(info);
        return CommonResult.success(result);
    }

    @ApiOperation("玩家心愿单")
    @RequestMapping(value = "/remind", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPlayerRemind(@RequestParam Long playerId){
        List<GameInfoSimple> simples = spaceService.getPlayerRemain(playerId);
        return CommonResult.success(simples);
    }

    @ApiOperation("玩家收藏帖子列表")
    @RequestMapping(value = "/collection", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPlayerCollection(@RequestParam Long playerId){
        List<PostCollection> collections = spaceService.getPostCollection(playerId);
        return CommonResult.success(collections);
    }

    @ApiOperation("玩家点赞帖子列表")
    @RequestMapping(value = "/liked", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPlayerLiked(@RequestParam Long playerId){
        List<PostLiked> collections = spaceService.getPostLiked(playerId);
        return CommonResult.success(collections);
    }

    @ApiOperation("查询玩家积分")
    @RequestMapping(value = "/integral", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPlayerIntegral(@RequestParam Long playerId){
        String integral = spaceService.getPlayerIntegral(playerId);
        return CommonResult.success(integral);
    }

}
