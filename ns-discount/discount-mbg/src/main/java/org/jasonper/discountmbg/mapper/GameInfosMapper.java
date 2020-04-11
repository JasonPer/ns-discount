package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameInfos;
import org.jasonper.discountmbg.model.GameInfosExample;

public interface GameInfosMapper {
    long countByExample(GameInfosExample example);

    int deleteByExample(GameInfosExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameInfos record);

    int insertSelective(GameInfos record);

    List<GameInfos> selectByExampleWithBLOBs(GameInfosExample example);

    List<GameInfos> selectByExample(GameInfosExample example);

    GameInfos selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameInfos record, @Param("example") GameInfosExample example);

    int updateByExampleWithBLOBs(@Param("record") GameInfos record, @Param("example") GameInfosExample example);

    int updateByExample(@Param("record") GameInfos record, @Param("example") GameInfosExample example);

    int updateByPrimaryKeySelective(GameInfos record);

    int updateByPrimaryKeyWithBLOBs(GameInfos record);

    int updateByPrimaryKey(GameInfos record);
}