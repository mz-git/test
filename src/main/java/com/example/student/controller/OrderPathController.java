package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.OrderInfo;
import com.example.student.service.OrderPathService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@RestController
@RequestMapping("/orderPath")
@Api(value = "订单轨迹")
public class OrderPathController {

    @Autowired
    private OrderPathService orderPathService;

    @PostMapping("/createOrder")
    @ApiOperation(value = "创建订单")
    public ResultObject<OrderInfo> createOrder(@RequestBody @Valid OrderInfo orderInfo){
        return orderPathService.createOrder(orderInfo);
    }

}

