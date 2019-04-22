package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Course;
import com.example.student.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMapper extends BaseMapper<Course> {

    List<CourseSelectVO> getListByCourse(CourseSelectDTO courseSelectDTO);

    List<StuByCourseVO> getStuByCourse(@Param("course") String course);

    List<StusByCourseVO> getStusByCourse();

    List<CourVO> getCourDetial(CourseDetialDTO courseDetialDTO);

}
