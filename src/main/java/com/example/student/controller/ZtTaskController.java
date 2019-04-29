package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.ZtTask;
import com.example.student.service.ZtTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
@RestController
@RequestMapping("/ztTask")
@Api(value = "Zt任务信息")
public class ZtTaskController {

    @Autowired
    private ZtTaskService ztTaskService;

    @GetMapping("/getTaskById/{id}")
    @ApiOperation(value = "根据任务id查询任务信息")
    public ResultObject<ZtTask> getTaskById(@PathVariable Long id){
        return ztTaskService.getTaskById(id);
    }

    @PostMapping("/newTask")
    @ApiOperation(value = "新建任务")
    public ResultObject<ZtTask> newTask(@RequestBody ZtTask ztTask){

        return ztTaskService.newTask(ztTask);
    }
}

