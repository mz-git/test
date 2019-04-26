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
@TableName("order_oper")
public class OrderOper implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 派件时间
     */
    @TableField("send_time")
    private LocalDateTime sendTime;
    /**
     * 签收时间
     */
    @TableField("sign_time")
    private LocalDateTime signTime;
    /**
     * 签收人姓名
     */
    @TableField("sign_name")
    private String signName;
    /**
     * 订单状态
     */
    @TableField("order_status")
    private Long orderStatus;


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

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public LocalDateTime getSignTime() {
        return signTime;
    }

    public void setSignTime(LocalDateTime signTime) {
        this.signTime = signTime;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public Long getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrderOper{" +
        ", id=" + id +
        ", orderId=" + orderId +
        ", sendTime=" + sendTime +
        ", signTime=" + signTime +
        ", signName=" + signName +
        ", orderStatus=" + orderStatus +
        "}";
    }
}
