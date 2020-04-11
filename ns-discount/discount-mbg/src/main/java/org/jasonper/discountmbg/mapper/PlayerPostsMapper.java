package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerPosts;
import org.jasonper.discountmbg.model.PlayerPostsExample;

public interface PlayerPostsMapper {
    long countByExample(PlayerPostsExample example);

    int deleteByExample(PlayerPostsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerPosts record);

    int insertSelective(PlayerPosts record);

    List<PlayerPosts> selectByExample(PlayerPostsExample example);

    PlayerPosts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerPosts record, @Param("example") PlayerPostsExample example);

    int updateByExample(@Param("record") PlayerPosts record, @Param("example") PlayerPostsExample example);

    int updateByPrimaryKeySelective(PlayerPosts record);

    int updateByPrimaryKey(PlayerPosts record);
}