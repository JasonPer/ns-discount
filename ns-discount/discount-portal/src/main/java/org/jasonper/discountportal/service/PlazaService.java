package org.jasonper.discountportal.service;

import org.jasonper.discountmbg.model.PlayerComments;
import org.jasonper.discountmbg.model.PlayerPosts;
import org.jasonper.discountmbg.model.PlayerReplys;
import org.jasonper.discountmbg.model.ReportPosts;
import org.jasonper.discountportal.domain.PostDetail;
import org.jasonper.discountportal.domain.PostSimple;
import org.jasonper.discountportal.domain.TopGame;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/1 19:25
 * @description 游戏广场Service
 */
public interface PlazaService {
    /**
     * 获取热门游戏列表
     * @return
     */
    List<TopGame> getTopGames();

    /**
     * 根据关键字搜索游戏社区
     * @param gameName
     * @return
     */
    List<TopGame> searchGameCommunity(String gameName);

    /**
     * 分页获取玩家帖子（默认按时间倒序）
     * @return
     */
    List<PostSimple> getPlayerPostsList(Integer pageSize, Integer pageNum);

    /**
     * 分页获取热门游戏板块下的玩家帖子（按照游戏板块查询，默认时间倒序）
     * @param gameId 游戏id
     * @return
     */
    List<PostSimple> getPlayerPostsListByGameId(Long gameId, Integer pageSize, Integer pageNum);

    /**
     * 获取帖子详情及评论
     * @param postId
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<PostDetail> getPostDetailListByPostId(Long postId, Integer pageSize, Integer pageNum);

    /**
     * 玩家新建帖子
     * @param posts
     * @return
     */
    int addPlayerPost(PlayerPosts posts);

    /**
     * 玩家评论帖子
     * @param comment
     * @return
     */
    int addPlayerComment(PlayerComments comment);

    /**
     * 玩家回复
     * @param reply
     * @return
     */
    int addPlayerReply(PlayerReplys reply);

    /**
     * 玩家举报帖子
     * @param report
     * @return
     */
    int addPostReport(ReportPosts report);

    /**
     * 玩家模糊搜索帖子
     * @param keyWord
     * @return
     */
    List<PlayerPosts> searchPlayerPost(String keyWord);
}
