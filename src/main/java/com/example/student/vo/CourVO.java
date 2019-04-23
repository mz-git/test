package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "根据科目id和科目名称查询科目详情")
public class CourVO implements Serializable {

    public static final long serialVersionUID = 789124L;

    @ApiModelProperty(value = "科目id")
    private Long cId;

    @ApiModelProperty(value = "科目名称")
    private String course;

    @ApiModelProperty(value = "科目详情")
    private List<StuDetailVO> students;

}
