package com.example.student.vo;

import lombok.Data;

import java.util.List;

@Data
public class CourVO {

    private Long cId;

    private String course;

    private List<StuDetialVO> students;

}
