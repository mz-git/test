package com.example.student.service;

import com.example.student.common.ResultObject;
import com.example.student.entity.ZtTask;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
public interface ZtTaskService extends IService<ZtTask> {

    ResultObject<ZtTask> getTaskById(Long id);

    ResultObject<ZtTask> newTask(ZtTask ztTask);

}
