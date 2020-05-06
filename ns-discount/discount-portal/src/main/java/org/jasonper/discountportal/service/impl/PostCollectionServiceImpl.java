package org.jasonper.discountportal.service.impl;

import org.jasonper.discountportal.domain.PostCollection;
import org.jasonper.discountportal.repository.PostCollectionRepository;
import org.jasonper.discountportal.service.PostCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:49
 * @description 玩家收藏帖子Service实现类
 */
@Service
public class PostCollectionServiceImpl implements PostCollectionService {
    @Autowired
    private PostCollectionRepository repository;

    @Override
    public int update(PostCollection postCollection) {
        int count = 0;
        PostCollection collection = repository.findByFromPlayerIdAndPostId(postCollection.getFromPlayerId(), postCollection.getPostId());
        if (collection == null){
            postCollection.setStatus(1);
            postCollection.setCreateTime(new Date());
            repository.save(postCollection);

            count = 1;
            return count;
        }

        if (collection.getStatus() == 0){
            collection.setStatus(1);
            collection.setCreateTime(new Date());
            repository.save(collection);

            count = 1;
            return count;
        }

        if (collection.getStatus() == 1){
            collection.setStatus(0);
            collection.setCreateTime(new Date());
            repository.save(collection);

            count = 0;
            return count;
        }

        return count;
    }


    @Override
    public List<PostCollection> list(Long playerId) {
        return repository.findByFromPlayerId(playerId);
    }
}
