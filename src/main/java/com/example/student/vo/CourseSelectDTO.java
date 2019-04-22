package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel("成绩查询条件VO")
public class CourseSelectDTO implements Serializable {

    private static final long serialVersionUID = -234565432176543L;

    @ApiModelProperty(value = "学生id")
    private List<Integer> tIds;

    @ApiModelProperty(value = "学生名称")
    private String sName;

    public List<Integer> gettIds() {
        return tIds;
    }

    public void settIds(List<Integer> tIds) {
        this.tIds = tIds;
    }


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
