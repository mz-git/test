package com.example.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.common.ResultObject;
import com.example.student.entity.Score;
import com.example.student.vo.AvgScVO;
import com.example.student.vo.AvgStuScVO;
import com.example.student.vo.StudentDetialVO;

import java.util.List;

public interface ScoreService extends IService<Score> {

    ResultObject<StudentDetialVO> getDetialById(Integer id);

    ResultObject<List<AvgScVO>> getAvgSc();

    ResultObject<List<AvgStuScVO>> getAvgStuSc();

}
