package com.example.student.service.impl;

import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public ResultObject<List<Student>> getList() {
        List<Student> list = studentMapper.getList();
        return ResultObject.success(list);
    }

    @Override
    public ResultObject<List<CourseSelectVO>> getListByCourse(CourseSelectDTO courseSelectDTO) {
        List<CourseSelectVO> co = studentMapper.getListByCourse(courseSelectDTO);
        return ResultObject.success(co);
    }

    @Override
    public ResultObject<List<StudentVO>>  getStuCourseNum() {
        List<StudentVO> list = studentMapper.getStuCourseNum();
        return ResultObject.success(list);
    }

    @Override
    public ResultObject<StudentDetialVO>  getDetialById(Integer id) {
        StudentDetialVO st = studentMapper.getDetialById(id);
        List<CourseDetialVO> list = studentMapper.getScoresByStuId(id);
        st.setCourseDetial(list);
        return ResultObject.success(st);
    }

    @Override
    public ResultObject<List<StuByCourseVO>> getStuByCourse(String course) {
        List<StuByCourseVO> sc = studentMapper.getStuByCourse(course);
        return ResultObject.success(sc);
    }

    @Override
    public ResultObject<List<StusByCourseVO>> getStusByCourse() {
        List<StusByCourseVO> st = studentMapper.getStusByCourse();
        return ResultObject.success(st);
    }

    @Override
    public ResultObject<List<AvgScVO>> getAvgSc() {
        List<AvgScVO> avgScVOS = studentMapper.getAvgSc();
        return ResultObject.success(avgScVOS);
    }

    @Override
    public ResultObject<List<AvgStuScVO>> getAvgStuSc() {
        List<AvgStuScVO> avgStuScVOS=studentMapper.getAvgStuSc();
        return ResultObject.success(avgStuScVOS);
    }

    @Override
    public ResultObject<List<CourVO>> getCourDetial(CourseDetialDTO courseDetialDTO) {
        List<CourVO> courVOList=studentMapper.getCourDetial(courseDetialDTO);
        return ResultObject.success(courVOList);
    }

    @Override
    public ResultObject<List<StuScoreVO>> getStuScore() {
        List<StuScoreVO> stuScoreVOS = studentMapper.getStuScore();
        return ResultObject.success(stuScoreVOS);
    }
}
