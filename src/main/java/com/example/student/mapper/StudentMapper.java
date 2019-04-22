package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Student;
import com.example.student.vo.StuScoreVO;
import com.example.student.vo.StudentVO;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
public interface StudentMapper extends BaseMapper<Student> {

    List<Student> getList();

    List<StudentVO> getStuCourseNum();

    List<StuScoreVO> getStuScore();

}
