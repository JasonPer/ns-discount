package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.Feedbacks;
import org.jasonper.discountmbg.model.FeedbacksExample;

public interface FeedbacksMapper {
    long countByExample(FeedbacksExample example);

    int deleteByExample(FeedbacksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Feedbacks record);

    int insertSelective(Feedbacks record);

    List<Feedbacks> selectByExample(FeedbacksExample example);

    Feedbacks selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Feedbacks record, @Param("example") FeedbacksExample example);

    int updateByExample(@Param("record") Feedbacks record, @Param("example") FeedbacksExample example);

    int updateByPrimaryKeySelective(Feedbacks record);

    int updateByPrimaryKey(Feedbacks record);
}