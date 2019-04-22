package com.example.student.vo;

import java.util.List;

public class StudentDetialVO {
    private Integer id;

    private String name;

    private List<CourseDetialVO> courseDetial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDetialVO> getCourseDetial() {
        return courseDetial;
    }

    public void setCourseDetial(List<CourseDetialVO> courseDetial) {
        this.courseDetial = courseDetial;
    }
}
