package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "科目查询明细VO")
public class CourseDetialDTO implements Serializable {

    private static final long serialVersionUID = -23498094546764L;

    @ApiModelProperty(value = "科目id")
    private List<Long> cIds;

    @ApiModelProperty(value = "科目名称")
    private String cNames;


}




