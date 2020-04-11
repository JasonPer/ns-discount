package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameVideos;
import org.jasonper.discountmbg.model.GameVideosExample;

public interface GameVideosMapper {
    long countByExample(GameVideosExample example);

    int deleteByExample(GameVideosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameVideos record);

    int insertSelective(GameVideos record);

    List<GameVideos> selectByExampleWithBLOBs(GameVideosExample example);

    List<GameVideos> selectByExample(GameVideosExample example);

    GameVideos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameVideos record, @Param("example") GameVideosExample example);

    int updateByExampleWithBLOBs(@Param("record") GameVideos record, @Param("example") GameVideosExample example);

    int updateByExample(@Param("record") GameVideos record, @Param("example") GameVideosExample example);

    int updateByPrimaryKeySelective(GameVideos record);

    int updateByPrimaryKeyWithBLOBs(GameVideos record);

    int updateByPrimaryKey(GameVideos record);
}