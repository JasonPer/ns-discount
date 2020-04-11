package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameBaseTypeRelation;
import org.jasonper.discountmbg.model.GameBaseTypeRelationExample;

public interface GameBaseTypeRelationMapper {
    long countByExample(GameBaseTypeRelationExample example);

    int deleteByExample(GameBaseTypeRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameBaseTypeRelation record);

    int insertSelective(GameBaseTypeRelation record);

    List<GameBaseTypeRelation> selectByExample(GameBaseTypeRelationExample example);

    GameBaseTypeRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameBaseTypeRelation record, @Param("example") GameBaseTypeRelationExample example);

    int updateByExample(@Param("record") GameBaseTypeRelation record, @Param("example") GameBaseTypeRelationExample example);

    int updateByPrimaryKeySelective(GameBaseTypeRelation record);

    int updateByPrimaryKey(GameBaseTypeRelation record);
}