package com.example.student.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
@ApiModel(value = "签收订单")
public class SignOrderVO implements Serializable {

    private static final long serialVersionUID = 352673L;

    @ApiModelProperty(value = "签收运单号")
    private Long orderNum;

    @ApiModelProperty(value = "签收人")
    private String signName;

}
