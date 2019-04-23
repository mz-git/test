package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "根据学生id和学生姓名查询学生成绩")
public class CourseSelectVO implements Serializable {

    public static final long serialVersionUID = 12354675L;

    @ApiModelProperty(value = "学生id")
    private Long id;

    @ApiModelProperty(value = "学生姓名")
    private String name;

    @ApiModelProperty(value = "学生成绩")
    private List<CourseVO> courses;

}
