package org.jasonper.discountportal.service;

import org.jasonper.discountportal.domain.PostLiked;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:17
 * @description 帖子点赞Service
 */
public interface PostLikedService {
    /**
     * 修改点赞状态
     * @param postLiked
     * @return
     */
    int update(PostLiked postLiked);

    /**
     * 玩家点赞列表
     * @param playerId
     * @return
     */
    List<PostLiked> list(Long playerId);
}
