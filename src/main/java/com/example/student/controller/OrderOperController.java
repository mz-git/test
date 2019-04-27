package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.OrderOper;
import com.example.student.service.OrderOperService;
import com.example.student.vo.SignOrderVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JMZ
 * @since 2019-04-26
 */
@RestController
@RequestMapping("/orderOper")
@Api(value = "操作订单")
public class OrderOperController {

    @Autowired
    private OrderOperService orderOperService;

    @GetMapping("/getOrderOper/{orderId}")
    @ApiOperation(value = "根据orderId查询orderOper")
    public ResultObject<OrderOper> getOrderOper(@PathVariable Long orderId){
        return orderOperService.getOrderOper(orderId);
    }

    @GetMapping("/sendOrder/{orderNum}")
    @ApiOperation(value = "根据运单号派送")
    public ResultObject<Void> sendOrder(@PathVariable Long orderNum){
        return orderOperService.sendOrder(orderNum);
    }

    @PostMapping("/signOrder")
    @ApiOperation(value = "根据订单号,签收人签收订单")
    public ResultObject<SignOrderVO> signOrder(@RequestBody SignOrderVO signOrderVO){
        return orderOperService.signOrder(signOrderVO);
    }


}

