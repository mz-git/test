package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel("成绩查询条件VO")
public class CourseSelectDTO implements Serializable {

    private static final long serialVersionUID = -234565432176543L;

    @ApiModelProperty(value = "学生id")
    private List<Long> tIds;

    @ApiModelProperty(value = "学生名称")
    private String sName;

}
