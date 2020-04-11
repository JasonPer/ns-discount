package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerPostsCollections;
import org.jasonper.discountmbg.model.PlayerPostsCollectionsExample;

public interface PlayerPostsCollectionsMapper {
    long countByExample(PlayerPostsCollectionsExample example);

    int deleteByExample(PlayerPostsCollectionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerPostsCollections record);

    int insertSelective(PlayerPostsCollections record);

    List<PlayerPostsCollections> selectByExample(PlayerPostsCollectionsExample example);

    PlayerPostsCollections selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerPostsCollections record, @Param("example") PlayerPostsCollectionsExample example);

    int updateByExample(@Param("record") PlayerPostsCollections record, @Param("example") PlayerPostsCollectionsExample example);

    int updateByPrimaryKeySelective(PlayerPostsCollections record);

    int updateByPrimaryKey(PlayerPostsCollections record);
}