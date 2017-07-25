package com.situ.ssm.mapper;

import com.situ.ssm.pojo.ClassCourseExample;
import com.situ.ssm.pojo.ClassCourseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassCourseMapper {
    int countByExample(ClassCourseExample example);

    int deleteByExample(ClassCourseExample example);

    int deleteByPrimaryKey(ClassCourseKey key);

    int insert(ClassCourseKey record);

    int insertSelective(ClassCourseKey record);

    List<ClassCourseKey> selectByExample(ClassCourseExample example);

    int updateByExampleSelective(@Param("record") ClassCourseKey record, @Param("example") ClassCourseExample example);

    int updateByExample(@Param("record") ClassCourseKey record, @Param("example") ClassCourseExample example);
}