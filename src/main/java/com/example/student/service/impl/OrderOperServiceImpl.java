package com.example.student.service.impl;

import com.example.student.common.ResultObject;
import com.example.student.entity.OrderInfo;
import com.example.student.entity.OrderOper;
import com.example.student.entity.OrderPath;
import com.example.student.mapper.OrderInfoMapper;
import com.example.student.mapper.OrderOperMapper;
import com.example.student.mapper.OrderPathMapper;
import com.example.student.service.OrderOperService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.vo.SignOrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@Service
public class OrderOperServiceImpl extends ServiceImpl<OrderOperMapper, OrderOper> implements OrderOperService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderOperMapper orderOperMapper;

    @Autowired
    private OrderPathMapper orderPathMapper;

    @Override
    public ResultObject<OrderOper> getOrderOper(Long orderId) {
        OrderOper orderOper = orderOperMapper.getOrderOper(orderId);
        return ResultObject.success(orderOper);
    }

    @Override
    public ResultObject<Void> sendOrder(Long orderNum) {

        OrderInfo orderInfo = orderInfoMapper.getOrderInfo(orderNum);

        if (orderInfo==null){
            return ResultObject.error("该运单号不存在!!");
        }

        OrderOper orderOper=orderOperMapper.getOrderOper(orderInfo.getId());
        if (orderOper.getOrderStatus()!=1001){
            return ResultObject.error("状态码错误!请检查!");
        }

        orderOper.setOrderStatus(1002L);
        orderOper.setSendTime(new Date());
        orderOperMapper.updateById(orderOper);

        OrderPath orderPath = new OrderPath();
        orderPath.setOrderId(orderInfo.getId());
        orderPath.setOperStatus(orderOper.getOrderStatus());
        orderPath.setOperTime(new Date());
        orderPath.setOperName("mn");
        orderPath.setOperDesc(orderPath.getOperName()+"在"+orderPath.getOperTime()+"派送订单!");
        orderPathMapper.insert(orderPath);

        return ResultObject.success(null);
    }

    @Override
    public ResultObject<SignOrderVO> signOrder(SignOrderVO signOrderVO) {

        Long orderNum = signOrderVO.getOrderNum();
        OrderInfo orderInfo = orderInfoMapper.getOrderInfo(orderNum);
        if (orderInfo.getId()==null){
            return ResultObject.error("该运单号不存在!!");
        }
        OrderOper orderOper = orderOperMapper.getOrderOper(orderInfo.getId());

        if (orderOper.getOrderStatus()!=1002){
            return ResultObject.error("状态码错误!!");
        }

        orderOper.setOrderStatus(1003L);
        orderOper.setSignTime(new Date());
        orderOper.setSignName(signOrderVO.getSignName());
        orderOperMapper.updateById(orderOper);

        OrderPath orderPath = new OrderPath();
        orderPath.setOrderId(orderOper.getOrderId());
        orderPath.setOperName("ti");
        orderPath.setOperStatus(orderOper.getOrderStatus());
        orderPath.setOperTime(new Date());
        orderPath.setOperDesc(orderPath.getOperName()+"在"+orderPath.getOperTime()+"签收订单!");
        orderPathMapper.insert(orderPath);

       return ResultObject.success(signOrderVO);
    }



}
