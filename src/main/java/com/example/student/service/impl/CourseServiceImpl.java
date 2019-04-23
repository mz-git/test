package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.common.ResultObject;
import com.example.student.entity.Course;
import com.example.student.mapper.CourseMapper;
import com.example.student.service.CourseService;
import com.example.student.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public ResultObject<List<CourseSelectVO>> getListByCourse(CourseSelectDTO courseSelectDTO) {
        List<CourseSelectVO> co = courseMapper.getListByCourse(courseSelectDTO);
        return ResultObject.success(co);
    }

    @Override
    public ResultObject<List<StuByCourseVO>> getStuByCourse(String course) {
        List<StuByCourseVO> sc = courseMapper.getStuByCourse(course);
        return ResultObject.success(sc);
    }

    @Override
    public ResultObject<List<StusByCourseVO>> getStusByCourse() {
        List<StusByCourseVO> st = courseMapper.getStusByCourse();
        return ResultObject.success(st);
    }

    @Override
    public ResultObject<List<CourVO>> getCourDetail(CourseDetailDTO courseDetailDTO) {
        List<CourVO> courVOList = courseMapper.getCourDetail(courseDetailDTO);
        return ResultObject.success(courVOList);
    }

}
