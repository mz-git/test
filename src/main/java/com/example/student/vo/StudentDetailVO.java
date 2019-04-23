package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "根据学生id查询学生学生成绩")
public class StudentDetailVO implements Serializable {

    public static final long serialVersionUID = 899352L;

    @ApiModelProperty(value = "学生id")
    private Long id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生成绩")
    private List<CourseDetailVO> courseDetail;

}
