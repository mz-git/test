package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
@ApiModel(value = "任务评审")
public class ZtReviTaskVO implements Serializable {

    private static final long serialVersionUID = 234678L;

    @ApiModelProperty(value = "任务id")
    private Long taskId;

    @ApiModelProperty(value = "评审人")
    private String revi;

}
