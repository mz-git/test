package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询学生成绩")
public class CourseDetailVO implements Serializable {

    private static final long serialVersionUID = 69834572960L;

    @ApiModelProperty(value = "科目成绩")
    private Double score;

    @ApiModelProperty(value = "科目名称")
    private String course;


}
