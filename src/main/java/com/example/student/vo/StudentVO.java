package com.example.student.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
public class StudentVO implements Serializable {

    private static final long serialVersionUID = 45678905456781L;

    /**
     * 主键
     */
    private Long stuId;
    /**
     * 姓名
     */
    private String stuName;

    /**
     * 课程数量
     */
    private Integer courseNum;

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }
}
