package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerPostsLikes;
import org.jasonper.discountmbg.model.PlayerPostsLikesExample;

public interface PlayerPostsLikesMapper {
    long countByExample(PlayerPostsLikesExample example);

    int deleteByExample(PlayerPostsLikesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerPostsLikes record);

    int insertSelective(PlayerPostsLikes record);

    List<PlayerPostsLikes> selectByExample(PlayerPostsLikesExample example);

    PlayerPostsLikes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerPostsLikes record, @Param("example") PlayerPostsLikesExample example);

    int updateByExample(@Param("record") PlayerPostsLikes record, @Param("example") PlayerPostsLikesExample example);

    int updateByPrimaryKeySelective(PlayerPostsLikes record);

    int updateByPrimaryKey(PlayerPostsLikes record);
}