package com.example.student.service;

import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.vo.*;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
public interface StudentService extends IService<Student> {

    ResultObject<List<Student>> getList();

    ResultObject<List<CourseSelectVO>> getListByCourse(CourseSelectDTO courseSelectDTO);

    ResultObject<List<StudentVO>>  getStuCourseNum();

    ResultObject<StudentDetialVO>  getDetialById(Integer id);


    ResultObject<List<StuByCourseVO>> getStuByCourse(String course);


    ResultObject<List<StusByCourseVO>> getStusByCourse();

    ResultObject<List<AvgScVO>> getAvgSc();

    ResultObject<List<AvgStuScVO>> getAvgStuSc();

    ResultObject<List<CourVO>> getCourseDetial(CourseDetialDTO courseDetialDTO);

    ResultObject<List<StuScoreVO>> getStuScore();

}
