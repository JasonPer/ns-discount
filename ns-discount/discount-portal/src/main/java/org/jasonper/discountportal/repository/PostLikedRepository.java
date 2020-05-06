package org.jasonper.discountportal.repository;

import org.jasonper.discountportal.domain.PostLiked;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:43
 * @description
 */
public interface PostLikedRepository extends MongoRepository<PostLiked, String> {
    PostLiked findByFromPlayerIdAndPostId(Long fromPlayerId, Long postId);
    List<PostLiked> findByFromPlayerId(Long fromPlayerId);
}
