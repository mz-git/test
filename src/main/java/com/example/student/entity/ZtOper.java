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
@TableName("zt_oper")
public class ZtOper implements Serializable {

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
     * 状态码
     */
    private String status;
    /**
     * 评审时间
     */
    @TableField("revi_time")
    private LocalDateTime reviTime;
    /**
     * 关闭时间
     */
    @TableField("clos_time")
    private LocalDateTime closTime;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getReviTime() {
        return reviTime;
    }

    public void setReviTime(LocalDateTime reviTime) {
        this.reviTime = reviTime;
    }

    public LocalDateTime getClosTime() {
        return closTime;
    }

    public void setClosTime(LocalDateTime closTime) {
        this.closTime = closTime;
    }

    @Override
    public String toString() {
        return "ZtOper{" +
        ", id=" + id +
        ", taskId=" + taskId +
        ", status=" + status +
        ", reviTime=" + reviTime +
        ", closTime=" + closTime +
        "}";
    }
}
