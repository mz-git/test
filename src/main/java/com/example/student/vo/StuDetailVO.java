package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询科目详情")
public class StuDetailVO implements Serializable {

    public static final long serialVersionUID = 678235L;

    @ApiModelProperty(value = "学生id")
    private Long stId;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生成绩")
    private Double score;

}
