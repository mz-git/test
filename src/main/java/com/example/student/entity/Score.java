package com.example.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author JMZ
 * @since 2019-04-20
 */
@Data
public class Score implements Serializable {

    private static final long serialVersionUID = 56879056789L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long stId;

    private Long coId;

    private Double score;

}
