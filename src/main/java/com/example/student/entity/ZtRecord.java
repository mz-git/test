package com.example.student.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
@TableName("zt_record")
public class ZtRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 任务表id
     */
    @TableField("task_id")
    private Long taskId;
    /**
     * 操作时间
     */
    @TableField("oper_time")
    private LocalDateTime operTime;
    /**
     * 操作描述
     */
    @TableField("oper_desc")
    private String operDesc;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
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
        return "ZtRecord{" +
        ", id=" + id +
        ", taskId=" + taskId +
        ", operTime=" + operTime +
        ", operDesc=" + operDesc +
        "}";
    }
}
