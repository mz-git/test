package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import com.example.student.vo.*;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.runtime.RewriteException;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.time.temporal.ValueRange;
import java.util.List;

/**
 * <p>
 *  前端控制器
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
    public ResultObject<List<Student>> list(){
        return studentService.getList();
    }

    @PostMapping("/listByCourse")
    @ApiOperation(value = "根据学生id和学生名字查询学生选择的科目")
    public ResultObject<List<CourseSelectVO>> listByCourse(@RequestBody CourseSelectDTO courseSelectDTO){
        return studentService.getListByCourse(courseSelectDTO);
    }

    @GetMapping("/getStuCourseNum")
    @ApiOperation(value = "查询学生选课数量")
    public ResultObject<List<StudentVO>> getStuCourseNum(){
        return studentService.getStuCourseNum();
    }

    @GetMapping("/getDetialById/{id}")
    @ApiOperation(value = "根据学生id查询学生成绩")
    public ResultObject<StudentDetialVO> getDetialById(@PathVariable("id") Integer id){
        return studentService.getDetialById(id);
    }

    @PostMapping("/getStuByCourse/{course}")
    @ApiOperation(value = "查询学科下的学生")
    public ResultObject<List<StuByCourseVO>> getStuByCourse(@RequestParam(value = "course",required = true)String course){
        return studentService.getStuByCourse(course);
    }

    @PostMapping("/getStusByCourse")
    @ApiOperation(value = "查询学科的人数")
    public ResultObject<List<StusByCourseVO>> getStusByCourse(){
        return studentService.getStusByCourse();
    }

    @PostMapping("/getAvgSc")
    @ApiOperation(value = "查询学科平均分")
    public ResultObject<List<AvgScVO>> getAvgSc(){
        return studentService.getAvgSc();
    }

    @PostMapping("/getAvgStuSc")
    @ApiOperation(value = "查询个人平均分")
    public ResultObject<List<AvgStuScVO>> getAvgStuSc(){
        return studentService.getAvgStuSc();
    }

    @PostMapping("/getCourseDetial")
    @ApiOperation(value = "根据科目id和科目名称查询科目详情")
    public ResultObject<List<CourVO>> getCourseDetial(@RequestBody CourseDetialDTO courseDetialDTO){
        return studentService.getCourseDetial(courseDetialDTO);
    }

    @PostMapping("/getStuScore")
    @ApiOperation(value = "查询学生各科成绩")
    public ResultObject<List<StuScoreVO>> getStuScore(){
        return studentService.getStuScore();
    }

}

