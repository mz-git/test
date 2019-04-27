package com.example.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.common.ResultObject;
import com.example.student.entity.OrderInfo;
import com.example.student.entity.OrderOper;
import com.example.student.entity.OrderPath;
import com.example.student.mapper.OrderInfoMapper;
import com.example.student.mapper.OrderOperMapper;
import com.example.student.mapper.OrderPathMapper;
import com.example.student.service.OrderPathService;
import com.mysql.jdbc.log.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@Service
public class OrderPathServiceImpl extends ServiceImpl<OrderPathMapper, OrderPath> implements OrderPathService {

//    public static final Logger LOGGER = LogFactory.getLogger(OrderPathServiceImpl.class);

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private OrderOperMapper orderOperMapper;

    @Autowired
    private OrderPathMapper orderPathMapper;

    @Override
    public ResultObject<OrderInfo> createOrder(OrderInfo orderInfo) {
        OrderInfo info = orderInfoMapper.getOrderInfo(orderInfo.getOrderNum());

//        orderInfo.setId(1L);
        if (info!=null&&info.getId()!=null) {
            return ResultObject.error("该运单号已经存在!请重新输入!");
        }

        orderInfo.setCreateTime(new Date());
        orderInfoMapper.insert(orderInfo);

        OrderOper orderOper = new OrderOper();
//        orderOper.setId(1L);
        orderOper.setOrderId(orderInfo.getId());
        orderOper.setOrderStatus(1001L);
        orderOperMapper.insert(orderOper);

        OrderPath orderPath = new OrderPath();
//        orderPath.setId(1L);
        orderPath.setOrderId(orderInfo.getId());
        orderPath.setOperStatus(1001L);
        orderPath.setOperName("JMZ002");
        orderPath.setOperTime(new Date());
        orderPath.setOperDesc(orderPath.getOperName() + "在" + orderPath.getOperTime() + "创建订单");
        orderPathMapper.insert(orderPath);

        return ResultObject.success(info);
    }
}
