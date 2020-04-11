package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerGameReminds;
import org.jasonper.discountmbg.model.PlayerGameRemindsExample;

public interface PlayerGameRemindsMapper {
    long countByExample(PlayerGameRemindsExample example);

    int deleteByExample(PlayerGameRemindsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerGameReminds record);

    int insertSelective(PlayerGameReminds record);

    List<PlayerGameReminds> selectByExample(PlayerGameRemindsExample example);

    PlayerGameReminds selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerGameReminds record, @Param("example") PlayerGameRemindsExample example);

    int updateByExample(@Param("record") PlayerGameReminds record, @Param("example") PlayerGameRemindsExample example);

    int updateByPrimaryKeySelective(PlayerGameReminds record);

    int updateByPrimaryKey(PlayerGameReminds record);
}