package com.example.student.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "封装类")
public class ResultObject<T> implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    private String code;

    private String msg;

    private T data;

    @ApiModelProperty(value = "success方法")
    public static <T> ResultObject<T> success(T t) {
        ResultObject ro = new ResultObject();
        ro.code = "success";
        ro.data = t;
        return ro;
    }

    @ApiModelProperty(value = "error方法")
    public static <T> ResultObject<T> error(String msg) {
        ResultObject ro = new ResultObject();
        ro.code = "error";
        ro.msg = msg;
        return ro;
    }

}
