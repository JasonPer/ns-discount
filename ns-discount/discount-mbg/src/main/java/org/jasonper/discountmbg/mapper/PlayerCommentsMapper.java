package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.PlayerComments;
import org.jasonper.discountmbg.model.PlayerCommentsExample;

public interface PlayerCommentsMapper {
    long countByExample(PlayerCommentsExample example);

    int deleteByExample(PlayerCommentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlayerComments record);

    int insertSelective(PlayerComments record);

    List<PlayerComments> selectByExample(PlayerCommentsExample example);

    PlayerComments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlayerComments record, @Param("example") PlayerCommentsExample example);

    int updateByExample(@Param("record") PlayerComments record, @Param("example") PlayerCommentsExample example);

    int updateByPrimaryKeySelective(PlayerComments record);

    int updateByPrimaryKey(PlayerComments record);
}