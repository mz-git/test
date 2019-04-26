package com.example.student.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@TableName("order_path")
public class OrderPath implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;
    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 操作状态码
     */
    @TableField("oper_status")
    private Long operStatus;
    /**
     * 操作人姓名
     */
    @TableField("oper_name")
    private String operName;
    /**
     * 操作时间
     */
    @TableField("oper_time")
    private LocalDateTime operTime;
    /**
     * 操作描述信息
     */
    @TableField("oper_desc")
    private String operDesc;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOperStatus() {
        return operStatus;
    }

    public void setOperStatus(Long operStatus) {
        this.operStatus = operStatus;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public LocalDateTime getOperTime() {
        return operTime;
    }

    public void setOperTime(LocalDateTime operTime) {
        this.operTime = operTime;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    @Override
    public String toString() {
        return "OrderPath{" +
        ", id=" + id +
        ", orderId=" + orderId +
        ", operStatus=" + operStatus +
        ", operName=" + operName +
        ", operTime=" + operTime +
        ", operDesc=" + operDesc +
        "}";
    }
}
