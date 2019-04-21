package com.example.student.vo;

import java.util.List;

public class CourseSelectVO {

    private Integer id;

    private String name;

    private List<CourseVO> courses;

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

    public List<CourseVO> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseVO> courses) {
        this.courses = courses;
    }
}
