package com.example.student.mapper;

import com.example.student.entity.OrderInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {

    OrderInfo getOrderInfo(@Param("orderNum") Long orderNum);

}
