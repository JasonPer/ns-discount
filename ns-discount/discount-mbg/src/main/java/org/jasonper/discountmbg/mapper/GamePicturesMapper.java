package org.jasonper.discountmbg.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jasonper.discountmbg.model.GamePictures;
import org.jasonper.discountmbg.model.GamePicturesExample;

public interface GamePicturesMapper {
    long countByExample(GamePicturesExample example);

    int deleteByExample(GamePicturesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GamePictures record);

    int insertSelective(GamePictures record);

    List<GamePictures> selectByExampleWithBLOBs(GamePicturesExample example);

    List<GamePictures> selectByExample(GamePicturesExample example);

    GamePictures selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GamePictures record, @Param("example") GamePicturesExample example);

    int updateByExampleWithBLOBs(@Param("record") GamePictures record, @Param("example") GamePicturesExample example);

    int updateByExample(@Param("record") GamePictures record, @Param("example") GamePicturesExample example);

    int updateByPrimaryKeySelective(GamePictures record);

    int updateByPrimaryKeyWithBLOBs(GamePictures record);

    int updateByPrimaryKey(GamePictures record);
}