package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "关闭任务")
public class ZtCloseTaskVO implements Serializable {

    private static final long serialVersionUID = 1423546587L;

    @ApiModelProperty(value = "任务id")
    private Long taskId;

    @ApiModelProperty(value = "关闭任务人")
    private String clos;

}

