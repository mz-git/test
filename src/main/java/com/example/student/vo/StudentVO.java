package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
@Data
@ApiModel(value = "查询学生选课数量")
public class StudentVO implements Serializable {

    private static final long serialVersionUID = 45678905456781L;

    @ApiModelProperty(value = "学生id")
    private Long stuId;

    @ApiModelProperty(value = "学生姓名")
    private String stuName;

    @ApiModelProperty(value = "选课数量")
    private Long courseNum;

}
