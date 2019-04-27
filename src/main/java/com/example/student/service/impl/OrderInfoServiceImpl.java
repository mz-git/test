package com.example.student.service.impl;

import com.example.student.common.ResultObject;
import com.example.student.entity.OrderInfo;
import com.example.student.mapper.OrderInfoMapper;
import com.example.student.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public ResultObject<OrderInfo> getOrderInfo(Long orderNum) {

        OrderInfo orderInfo = orderInfoMapper.getOrderInfo(orderNum);

        return ResultObject.success(orderInfo);
    }

}
