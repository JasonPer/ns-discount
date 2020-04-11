package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GameBases;
import org.jasonper.discountmbg.model.GameBasesExample;

public interface GameBasesMapper {
    long countByExample(GameBasesExample example);

    int deleteByExample(GameBasesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GameBases record);

    int insertSelective(GameBases record);

    List<GameBases> selectByExampleWithBLOBs(GameBasesExample example);

    List<GameBases> selectByExample(GameBasesExample example);

    GameBases selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GameBases record, @Param("example") GameBasesExample example);

    int updateByExampleWithBLOBs(@Param("record") GameBases record, @Param("example") GameBasesExample example);

    int updateByExample(@Param("record") GameBases record, @Param("example") GameBasesExample example);

    int updateByPrimaryKeySelective(GameBases record);

    int updateByPrimaryKeyWithBLOBs(GameBases record);

    int updateByPrimaryKey(GameBases record);
}