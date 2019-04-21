package com.example.student.mapper;

import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getList();

    List<CourseSelectVO> getListByCourse(CourseSelectDTO courseSelectDTO);

    List<StudentVO> getStuCourseNum();

    StudentDetialVO getDetialById(@Param("id") Integer id);

    List<CourseDetialVO> getScoresByStuId(@Param("stId") Integer stId);


    List<StuByCourseVO> getStuByCourse(@Param("course") String course);


    List<StusByCourseVO> getStusByCourse();

    List<AvgScVO> getAvgSc();

    List<AvgStuScVO> getAvgStuSc();

    List<CourVO> getCourseDetial(CourseDetialDTO courseDetialDTO);

    List<StuScoreVO> getStuScore();

}
