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
@TableName("order_info")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 订单号
     */
    @TableField("order_num")
    private Long orderNum;
    /**
     * 发件人姓名
     */
    @TableField("send_name")
    private String sendName;
    /**
     * 收件人姓名
     */
    @TableField("rece_name")
    private String receName;
    /**
     * 收件人地址
     */
    @TableField("rece_addr")
    private String receAddr;
    /**
     * 订单创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getReceName() {
        return receName;
    }

    public void setReceName(String receName) {
        this.receName = receName;
    }

    public String getReceAddr() {
        return receAddr;
    }

    public void setReceAddr(String receAddr) {
        this.receAddr = receAddr;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
        ", id=" + id +
        ", orderNum=" + orderNum +
        ", sendName=" + sendName +
        ", receName=" + receName +
        ", receAddr=" + receAddr +
        ", createTime=" + createTime +
        "}";
    }
}
