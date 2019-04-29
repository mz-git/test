package com.example.student.controller;


import com.example.student.common.ResultObject;
import com.example.student.entity.ZtOper;
import com.example.student.service.ZtOperService;
import com.example.student.vo.ZtCloseTaskVO;
import com.example.student.vo.ZtReviTaskVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
@RestController
@RequestMapping("/ztOper")
@Api(value = "Zt操作信息")
public class ZtOperController {

    @Autowired
    private ZtOperService ztOperService;

    @GetMapping("/getOperByTaskId/{taskId}")
    @ApiOperation(value = "根据任务id查询操作信息")
    public ResultObject<ZtOper> getOperByTaskId(@PathVariable Long taskId){
        return ztOperService.getOperByTaskId(taskId);
    }

    @PostMapping("/reviTask")
    @ApiOperation(value = "根据任务id评审任务")
    public ResultObject<ZtReviTaskVO> reviTask(@RequestBody ZtReviTaskVO ztReviTaskVO){
        return ztOperService.reviTask(ztReviTaskVO);
    }

    @PostMapping("/closeTask")
    @ApiOperation(value = "根据任务id关闭任务")
    public ResultObject<Void> closeTask(@RequestBody ZtCloseTaskVO ztCloseTaskVO){
        return ztOperService.closeTask(ztCloseTaskVO);
    }


}

