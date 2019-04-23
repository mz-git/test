package com.example.student.controller;

import com.example.student.common.ResultObject;
import com.example.student.service.ScoreService;
import com.example.student.vo.AvgScVO;
import com.example.student.vo.AvgStuScVO;
import com.example.student.vo.StudentDetailVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/score")
@Api(value = "score信息")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/getDetailById/{id}")
    @ApiOperation(value = "根据学生id查询学生成绩")
    public ResultObject<StudentDetailVO> getDetailById(@PathVariable("id") Integer id) {
        return scoreService.getDetailById(id);
    }

    @PostMapping("/getAvgSc")
    @ApiOperation(value = "查询学科平均分")
    public ResultObject<List<AvgScVO>> getAvgSc() {
        return scoreService.getAvgSc();
    }

    @PostMapping("/getAvgStuSc")
    @ApiOperation(value = "查询个人平均分")
    public ResultObject<List<AvgStuScVO>> getAvgStuSc() {
        return scoreService.getAvgStuSc();
    }
}
