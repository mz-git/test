package com.example.student.mapper;

import com.example.student.entity.ZtOper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
public interface ZtOperMapper extends BaseMapper<ZtOper> {

    ZtOper getOperByTaskId(Long taskId);
}
