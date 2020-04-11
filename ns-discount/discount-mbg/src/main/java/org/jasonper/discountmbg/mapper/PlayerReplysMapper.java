package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerReplys;
import org.jasonper.discountmbg.model.PlayerReplysExample;

public interface PlayerReplysMapper {
    long countByExample(PlayerReplysExample example);

    int deleteByExample(PlayerReplysExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerReplys record);

    int insertSelective(PlayerReplys record);

    List<PlayerReplys> selectByExample(PlayerReplysExample example);

    PlayerReplys selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerReplys record, @Param("example") PlayerReplysExample example);

    int updateByExample(@Param("record") PlayerReplys record, @Param("example") PlayerReplysExample example);

    int updateByPrimaryKeySelective(PlayerReplys record);

    int updateByPrimaryKey(PlayerReplys record);
}