package org.jasonper.discountportal.service;

import org.jasonper.discountportal.domain.PostCollection;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:16
 * @description 帖子收藏Service
 */
public interface PostCollectionService {
    /**
     * 修改收藏状态:1,已收藏 0,未收藏
     * @param postCollection
     * @return
     */
    int update(PostCollection postCollection);

    /**
     * 玩家收藏列表
     * @param playerId
     * @return
     */
    List<PostCollection> list(Long playerId);
}
