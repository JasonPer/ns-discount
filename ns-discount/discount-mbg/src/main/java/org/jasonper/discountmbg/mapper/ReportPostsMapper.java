package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.ReportPosts;
import org.jasonper.discountmbg.model.ReportPostsExample;

public interface ReportPostsMapper {
    long countByExample(ReportPostsExample example);

    int deleteByExample(ReportPostsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ReportPosts record);

    int insertSelective(ReportPosts record);

    List<ReportPosts> selectByExample(ReportPostsExample example);

    ReportPosts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ReportPosts record, @Param("example") ReportPostsExample example);

    int updateByExample(@Param("record") ReportPosts record, @Param("example") ReportPostsExample example);

    int updateByPrimaryKeySelective(ReportPosts record);

    int updateByPrimaryKey(ReportPosts record);
}