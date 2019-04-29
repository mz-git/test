package com.example.student.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
@TableName("zt_task")
public class ZtTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String des;
    /**
     * 评审人
     */
    private String revi;
    /**
     * 创建人
     */
    private String crea;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRevi() {
        return revi;
    }

    public void setRevi(String revi) {
        this.revi = revi;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "ZtTask{" +
        ", id=" + id +
        ", title=" + title +
        ", des=" + des +
        ", revi=" + revi +
        ", crea=" + crea +
        "}";
    }
}
