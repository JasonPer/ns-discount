package org.jasonper.discountportal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasonper.discountcommon.api.CommonPage;
import org.jasonper.discountcommon.api.CommonResult;
import org.jasonper.discountmbg.model.PlayerComments;
import org.jasonper.discountmbg.model.PlayerPosts;
import org.jasonper.discountmbg.model.PlayerReplys;
import org.jasonper.discountmbg.model.ReportPosts;
import org.jasonper.discountportal.domain.*;
import org.jasonper.discountportal.service.PlazaService;
import org.jasonper.discountportal.service.PostCollectionService;
import org.jasonper.discountportal.service.PostLikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/1 19:51
 * @description 游戏广场Controller
 */
@Controller
@Api(tags = "PlazaController", description = "游戏广场管理")
@RequestMapping("/plaza")
public class PlazaController {
    @Autowired
    private PlazaService plazaService;

    @Autowired
    private PostCollectionService collectionService;

    @Autowired
    private PostLikedService likedService;

    @ApiOperation("热门游戏板块")
    @RequestMapping(value = "/show/getTopGamesList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult getTopGamesList(){
        List<TopGame> topGameList = plazaService.getTopGames();
        return CommonResult.success(topGameList);
    }

    @ApiOperation("最新帖子列表")
    @RequestMapping(value = "/show/getPlayerPost", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPlayerPostsList(@RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "12") Integer pageSize){
        List<PostSimple> details = plazaService.getPlayerPostsList(pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(details));
    }

    @ApiOperation("热门游戏板块下的帖子列表")
    @RequestMapping(value = "/show/getPlayerPostList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPlayerPostsListByGameId(@RequestParam Long gameId,
                                                   @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                   @RequestParam(required = false, defaultValue = "12") Integer pageSize){
        List<PostSimple> details = plazaService.getPlayerPostsListByGameId(gameId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(details));
    }

    @ApiOperation("帖子详情及下面的评论回复(盖楼模式)")
    @RequestMapping(value = "/show/getPostAndReply", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getPostDetailListByPostId(@RequestParam Long postId,
                                                   @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                   @RequestParam(required = false, defaultValue = "12") Integer pageSize){
        List<PostDetail> details = plazaService.getPostDetailListByPostId(postId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(details));
    }

    @ApiOperation("玩家收藏帖子")
    @RequestMapping(value = "/operate/collect", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult collect(@RequestBody PostCollection collection){
        int code = collectionService.update(collection);
        return CommonResult.success(code);
    }

    @ApiOperation("玩家点赞帖子")
    @RequestMapping(value = "/operate/like", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult like(@RequestBody PostLiked liked){
        int code = likedService.update(liked);
        return CommonResult.success(code);
    }

    @ApiOperation("搜索游戏板块:根据游戏名模糊搜索")
    @RequestMapping(value = "/show/getTopGamesCommunityList", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult getTopGamesCommunityList(@RequestParam String gameName){
        List<TopGame> topGameList = plazaService.searchGameCommunity(gameName);
        return CommonResult.success(topGameList);
    }

    @ApiOperation("玩家搜索帖子:根据关键字")
    @RequestMapping(value = "/show/searchPlayerPost", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult searchPlayerPost(@RequestParam String keyWord){
        List<PlayerPosts> playerPosts = plazaService.searchPlayerPost(keyWord);
        return CommonResult.success(playerPosts);
    }

    @ApiOperation("玩家新建帖子")
    @RequestMapping(value = "/operate/addPost", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addPlayerPost(@RequestBody PlayerPosts post){
        int code = plazaService.addPlayerPost(post);
        return CommonResult.success(code);
    }

    @ApiOperation("玩家评论帖子")
    @RequestMapping(value = "/operate/addComment", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addPlayerComment(@RequestBody PlayerComments comment){
        int code = plazaService.addPlayerComment(comment);
        return CommonResult.success(code);
    }

    @ApiOperation("玩家回复")
    @RequestMapping(value = "/operate/addReply", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addPlayerComment(@RequestBody PlayerReplys reply){
        int code = plazaService.addPlayerReply(reply);
        return CommonResult.success(code);
    }

    @ApiOperation("玩家举报帖子")
    @RequestMapping(value = "/operate/addReport", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addPostReport(@RequestBody ReportPosts report){
        int code = plazaService.addPostReport(report);
        return CommonResult.success(code);
    }
}
