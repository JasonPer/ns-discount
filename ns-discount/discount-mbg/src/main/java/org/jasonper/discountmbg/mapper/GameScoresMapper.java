package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameScores;
import org.jasonper.discountmbg.model.GameScoresExample;

public interface GameScoresMapper {
    long countByExample(GameScoresExample example);

    int deleteByExample(GameScoresExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameScores record);

    int insertSelective(GameScores record);

    List<GameScores> selectByExample(GameScoresExample example);

    GameScores selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameScores record, @Param("example") GameScoresExample example);

    int updateByExample(@Param("record") GameScores record, @Param("example") GameScoresExample example);

    int updateByPrimaryKeySelective(GameScores record);

    int updateByPrimaryKey(GameScores record);
}