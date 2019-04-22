package com.example.student.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Course implements Serializable {

    private static final long serialVersionUID = 12678903465L;

    private Long id;

    private String course;

}
