package org.jasonper.discountportal.repository;

import org.jasonper.discountportal.domain.PostCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:43
 * @description
 */
public interface PostCollectionRepository extends MongoRepository<PostCollection, String> {
    PostCollection findByFromPlayerIdAndPostId(Long fromPlayerId, Long postId);
    List<PostCollection> findByFromPlayerId(Long fromPlayerId);
}
