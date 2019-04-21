package com.example.student.common;

import java.io.Serializable;

public class ResultObject<T> implements Serializable {
    private static final long serialVersionUID = -5809782578272943999L;

    private String code;

    private String msg;

    private T data;

    public static ResultObject success(Object data){
        ResultObject ro = new ResultObject();
        ro.code="success";
        ro.data=data;
        return ro;
    }

    public static ResultObject error(String msg){
        ResultObject ro = new ResultObject();
        ro.code="error";
        ro.msg=msg;
        return ro;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
