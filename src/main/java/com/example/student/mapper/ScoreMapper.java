package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Score;
import com.example.student.vo.AvgScVO;
import com.example.student.vo.AvgStuScVO;
import com.example.student.vo.CourseDetailVO;
import com.example.student.vo.StudentDetailVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper extends BaseMapper<Score> {

    StudentDetailVO getDetailById(@Param("id") Long id);

    List<CourseDetailVO> getScoresByStuId(@Param("stId") Long stId);

    List<AvgScVO> getAvgSc();

    List<AvgStuScVO> getAvgStuSc();

}
