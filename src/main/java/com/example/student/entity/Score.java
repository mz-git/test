package com.example.student.entity;

import lombok.Data;

@Data
public class Score {

    private static final long serialVersionUID = 56879056789L;

    private Long id;

    private Long stId;

    private Long coId;

    private Double score;

}
