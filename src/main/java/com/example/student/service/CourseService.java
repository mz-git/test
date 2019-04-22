package com.example.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.common.ResultObject;
import com.example.student.entity.Course;
import com.example.student.vo.*;

import java.util.List;

public interface CourseService extends IService<Course> {

    ResultObject<List<CourseSelectVO>> getListByCourse(CourseSelectDTO courseSelectDTO);

    ResultObject<List<StuByCourseVO>> getStuByCourse(String course);

    ResultObject<List<StusByCourseVO>> getStusByCourse();

    ResultObject<List<CourVO>> getCourDetial(CourseDetialDTO courseDetialDTO);
}
