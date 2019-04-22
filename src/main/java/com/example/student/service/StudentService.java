package com.example.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.example.student.vo.StuScoreVO;
import com.example.student.vo.StudentVO;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
public interface StudentService extends IService<Student> {

    ResultObject<List<Student>> getList();

    ResultObject<List<StudentVO>> getStuCourseNum();

    ResultObject<List<StuScoreVO>> getStuScore();

}
