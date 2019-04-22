package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.common.ResultObject;
import com.example.student.entity.Student;
import com.example.student.mapper.StudentMapper;
import com.example.student.service.StudentService;
import com.example.student.vo.StuScoreVO;
import com.example.student.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
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
    public ResultObject<List<StudentVO>> getStuCourseNum() {
        List<StudentVO> list = studentMapper.getStuCourseNum();
        return ResultObject.success(list);
    }

    @Override
    public ResultObject<List<StuScoreVO>> getStuScore() {
        List<StuScoreVO> stuScoreVOS = studentMapper.getStuScore();
        return ResultObject.success(stuScoreVOS);
    }
}
