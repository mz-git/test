package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "查询学科平均分")
public class AvgScVO implements Serializable {

    private static final long serialVersionUID = 32586789899889L;

    @ApiModelProperty(value = "科目id")
    private Long id;

    @ApiModelProperty(value = "科目名称")
    private String course;

    @ApiModelProperty(value = "科目平均分")
    private Double avgSc;

}
