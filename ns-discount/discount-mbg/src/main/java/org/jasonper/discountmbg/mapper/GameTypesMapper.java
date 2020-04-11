package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameTypes;
import org.jasonper.discountmbg.model.GameTypesExample;

public interface GameTypesMapper {
    long countByExample(GameTypesExample example);

    int deleteByExample(GameTypesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameTypes record);

    int insertSelective(GameTypes record);

    List<GameTypes> selectByExample(GameTypesExample example);

    GameTypes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameTypes record, @Param("example") GameTypesExample example);

    int updateByExample(@Param("record") GameTypes record, @Param("example") GameTypesExample example);

    int updateByPrimaryKeySelective(GameTypes record);

    int updateByPrimaryKey(GameTypes record);
}