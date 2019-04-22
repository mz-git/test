package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import com.example.student.vo.StuScoreVO;
import com.example.student.vo.StudentVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
@RestController
@RequestMapping("/student")
@Api(value = "student信息")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    @ApiOperation(value = "查询")
    public ResultObject<List<Student>> list() {
        return studentService.getList();
    }

    @GetMapping("/getStuCourseNum")
    @ApiOperation(value = "查询学生选课数量")
    public ResultObject<List<StudentVO>> getStuCourseNum() {
        return studentService.getStuCourseNum();
    }

    @PostMapping("/getStuScore")
    @ApiOperation(value = "查询学生各科成绩")
    public ResultObject<List<StuScoreVO>> getStuScore() {
        return studentService.getStuScore();
    }

}

