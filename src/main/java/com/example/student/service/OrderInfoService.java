package com.example.student.service;

import com.example.student.common.ResultObject;
import com.example.student.entity.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
public interface OrderInfoService extends IService<OrderInfo> {

    ResultObject<OrderInfo> getOrderInfo(Long orderNum);

}
