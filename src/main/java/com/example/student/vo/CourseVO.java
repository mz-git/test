package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询学生成绩")
public class CourseVO implements Serializable {

    public static final long serialVersionUID = 7986564L;

    @ApiModelProperty(value = "学生成绩")
    private String course;

}
