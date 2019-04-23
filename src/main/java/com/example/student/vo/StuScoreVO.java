package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询学生各科成绩")
public class StuScoreVO implements Serializable {

    public static final long serialVersionUID = 65290568L;

    @ApiModelProperty(value = "学生id")
    private Long id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "语文成绩")
    private String 语文;

    @ApiModelProperty(value = "数学成绩")
    private String 数学;

    @ApiModelProperty(value = "英语成绩")
    private String 英语;

}