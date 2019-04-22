package com.example.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.student.entity.Score;
import com.example.student.vo.AvgScVO;
import com.example.student.vo.AvgStuScVO;
import com.example.student.vo.CourseDetialVO;
import com.example.student.vo.StudentDetialVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper extends BaseMapper<Score> {

    StudentDetialVO getDetialById(@Param("id") Integer id);

    List<CourseDetialVO> getScoresByStuId(@Param("stId") Integer stId);

    List<AvgScVO> getAvgSc();

    List<AvgStuScVO> getAvgStuSc();

}
