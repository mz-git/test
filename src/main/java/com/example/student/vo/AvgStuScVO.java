package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询个人平均分")
public class AvgStuScVO implements Serializable {

    private static final long serialVersionUID = 457689088L;

    @ApiModelProperty(value = "学生id")
    private Long id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生平均分")
    private Double avgStuSc;

}
