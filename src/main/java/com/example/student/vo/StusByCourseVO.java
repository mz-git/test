package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询学习某学科的总人数")
public class StusByCourseVO implements Serializable {

    public static final long serialVersionUID = 795346L;

    @ApiModelProperty(value = "科目id")
    private Long id;

    @ApiModelProperty(value = "科目名称")
    private String course;

    @ApiModelProperty(value = "总人数")
    private Long stus;

}
