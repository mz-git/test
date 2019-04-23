package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询选修科目的学生")
public class StuByCourseVO implements Serializable {

    public static final long serialVersionUID = 78935798L;

    @ApiModelProperty(value = "学生姓名")
    private String name;
}
