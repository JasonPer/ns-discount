package org.jasonper.discountportal.service.impl;

import org.jasonper.discountportal.domain.PostCollection;
import org.jasonper.discountportal.domain.PostLiked;
import org.jasonper.discountportal.repository.PostLikedRepository;
import org.jasonper.discountportal.service.PostLikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 18:54
 * @description
 */
@Service
public class PostLikedServiceImpl implements PostLikedService {
    @Autowired
    private PostLikedRepository repository;

    @Override
    public int update(PostLiked postLiked) {
        int count = 0;
        PostLiked liked = repository.findByFromPlayerIdAndPostId(postLiked.getFromPlayerId(), postLiked.getPostId());

        if (liked == null){
            postLiked.setStatus(1);
            postLiked.setCreateTime(new Date());
            repository.save(postLiked);

            count = 1;
            return count;
        }

        if (liked.getStatus() == 0){
            liked.setStatus(1);
            liked.setCreateTime(new Date());
            repository.save(liked);

            count = 1;
            return count;
        }

        if (liked.getStatus() == 1){
            liked.setStatus(0);
            liked.setCreateTime(new Date());
            repository.save(liked);

            count = 0;
            return count;
        }
        return count;
    }


    @Override
    public List<PostLiked> list(Long playerId) {
        return repository.findByFromPlayerId(playerId);
    }
}
