package com.example.student.service;

import com.example.student.common.ResultObject;
import com.example.student.entity.OrderOper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.vo.SignOrderVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
public interface OrderOperService extends IService<OrderOper> {

    ResultObject<Void> sendOrder(Long orderNum);

    ResultObject<OrderOper> getOrderOper(Long orderId);

    ResultObject<SignOrderVO> signOrder(SignOrderVO signOrderVO);
}
