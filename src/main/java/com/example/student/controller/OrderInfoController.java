package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.OrderInfo;
import com.example.student.service.OrderInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@RestController
@RequestMapping("/orderInfo")
@Api(value = "订单信息")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("/getOrderInfo/{orderNum}")
    @ApiOperation(value = "根据运单号查询订单信息")
    public ResultObject<OrderInfo> getOrderInfo(@PathVariable Long orderNum){
        return orderInfoService.getOrderInfo(orderNum);
    }


}

