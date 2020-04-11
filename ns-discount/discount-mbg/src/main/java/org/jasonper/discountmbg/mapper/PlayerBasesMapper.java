package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerBases;
import org.jasonper.discountmbg.model.PlayerBasesExample;

public interface PlayerBasesMapper {
    long countByExample(PlayerBasesExample example);

    int deleteByExample(PlayerBasesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerBases record);

    int insertSelective(PlayerBases record);

    List<PlayerBases> selectByExample(PlayerBasesExample example);

    PlayerBases selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerBases record, @Param("example") PlayerBasesExample example);

    int updateByExample(@Param("record") PlayerBases record, @Param("example") PlayerBasesExample example);

    int updateByPrimaryKeySelective(PlayerBases record);

    int updateByPrimaryKey(PlayerBases record);
}