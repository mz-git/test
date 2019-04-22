package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.common.ResultObject;
import com.example.student.entity.Score;
import com.example.student.mapper.ScoreMapper;
import com.example.student.service.ScoreService;
import com.example.student.vo.AvgScVO;
import com.example.student.vo.AvgStuScVO;
import com.example.student.vo.CourseDetialVO;
import com.example.student.vo.StudentDetialVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public ResultObject<StudentDetialVO> getDetialById(Integer id) {
        StudentDetialVO st = scoreMapper.getDetialById(id);
        List<CourseDetialVO> list = scoreMapper.getScoresByStuId(id);
        st.setCourseDetial(list);
        return ResultObject.success(st);
    }

    @Override
    public ResultObject<List<AvgScVO>> getAvgSc() {
        List<AvgScVO> avgScVOS = scoreMapper.getAvgSc();
        return ResultObject.success(avgScVOS);
    }

    @Override
    public ResultObject<List<AvgStuScVO>> getAvgStuSc() {
        List<AvgStuScVO> avgStuScVOS = scoreMapper.getAvgStuSc();
        return ResultObject.success(avgStuScVOS);
    }

}
