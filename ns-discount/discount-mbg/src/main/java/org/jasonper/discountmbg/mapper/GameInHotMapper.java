package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameInHot;
import org.jasonper.discountmbg.model.GameInHotExample;

public interface GameInHotMapper {
    long countByExample(GameInHotExample example);

    int deleteByExample(GameInHotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameInHot record);

    int insertSelective(GameInHot record);

    List<GameInHot> selectByExample(GameInHotExample example);

    GameInHot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameInHot record, @Param("example") GameInHotExample example);

    int updateByExample(@Param("record") GameInHot record, @Param("example") GameInHotExample example);

    int updateByPrimaryKeySelective(GameInHot record);

    int updateByPrimaryKey(GameInHot record);
}