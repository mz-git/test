package com.example.student.controller;

import com.example.student.common.ResultObject;
import com.example.student.service.CourseService;
import com.example.student.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@Api(value = "course信息")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/listByCourse")
    @ApiOperation(value = "根据学生id和学生名字查询学生选择的科目")
    public ResultObject<List<CourseSelectVO>> listByCourse(@RequestBody CourseSelectDTO courseSelectDTO) {
        return courseService.getListByCourse(courseSelectDTO);
    }

    @PostMapping("/getStuByCourse/{course}")
    @ApiOperation(value = "查询学科下的学生")
    public ResultObject<List<StuByCourseVO>> getStuByCourse(@RequestParam(value = "course", required = true) String course) {
        return courseService.getStuByCourse(course);
    }

    @PostMapping("/getStusByCourse")
    @ApiOperation(value = "查询学科的人数")
    public ResultObject<List<StusByCourseVO>> getStusByCourse() {
        return courseService.getStusByCourse();
    }

    @PostMapping("/getCourDetial")
    @ApiOperation(value = "根据科目id和科目名称查询科目详情")
    public ResultObject<List<CourVO>> getCourseDetial(@RequestBody CourseDetialDTO courseDetialDTO) {
        return courseService.getCourDetial(courseDetialDTO);
    }
}
