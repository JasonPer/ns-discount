package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerAuths;
import org.jasonper.discountmbg.model.PlayerAuthsExample;

public interface PlayerAuthsMapper {
    long countByExample(PlayerAuthsExample example);

    int deleteByExample(PlayerAuthsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerAuths record);

    int insertSelective(PlayerAuths record);

    List<PlayerAuths> selectByExample(PlayerAuthsExample example);

    PlayerAuths selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerAuths record, @Param("example") PlayerAuthsExample example);

    int updateByExample(@Param("record") PlayerAuths record, @Param("example") PlayerAuthsExample example);

    int updateByPrimaryKeySelective(PlayerAuths record);

    int updateByPrimaryKey(PlayerAuths record);
}