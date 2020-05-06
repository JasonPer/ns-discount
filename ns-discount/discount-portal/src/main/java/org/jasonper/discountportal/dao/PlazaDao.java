package org.jasonper.discountportal.dao;

import org.jasonper.discountportal.domain.PostDetail;
import org.jasonper.discountportal.domain.PostSimple;
import org.jasonper.discountportal.domain.TopGame;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/1 22:26
 * @description 游戏广场自定义Dao
 */
public interface PlazaDao {
    /**
     * 获取全部帖子列表
     * @return
     */
    List<PostSimple> getPostSimpleList();

    /**
     * 获取游戏板块下的帖子详情
     * @param gameId
     * @return
     */
    List<PostSimple> getPostSimpleListByGameId(Long gameId);

    /**
     * 根据帖子id获取帖子详情
     * @param postId
     * @return
     */
    List<PostDetail> getPostDetailListByPostId(Long postId);

    /**
     * 根据游戏名搜索游戏社区
     * @param gameName
     * @return
     */
    List<TopGame> getGameCommunityByGameName(String gameName);

}
