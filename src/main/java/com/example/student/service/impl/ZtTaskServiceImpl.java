package com.example.student.service.impl;

import com.example.student.common.ResultObject;
import com.example.student.entity.ZtOper;
import com.example.student.entity.ZtRecord;
import com.example.student.entity.ZtTask;
import com.example.student.mapper.ZtOperMapper;
import com.example.student.mapper.ZtRecordMapper;
import com.example.student.mapper.ZtTaskMapper;
import com.example.student.service.ZtTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
@Service
public class ZtTaskServiceImpl extends ServiceImpl<ZtTaskMapper, ZtTask> implements ZtTaskService {

    @Autowired
    private ZtTaskMapper ztTaskMapper;

    @Autowired
    private ZtOperMapper ztOperMapper;

    @Autowired
    private ZtRecordMapper ztRecordMapper;

    @Override
    public ResultObject<ZtTask> getTaskById(Long id) {
        ZtTask ztTask=ztTaskMapper.getTaskById(id);
        return ResultObject.success(ztTask);
    }

    @Override
    public ResultObject<ZtTask> newTask(ZtTask ztTask) {

        ztTaskMapper.insert(ztTask);

        ZtOper ztOper=new ZtOper();
        ztOper.setTaskId(ztTask.getId());
        ztOper.setStatus("1001");
        ztOperMapper.insert(ztOper);

        ZtRecord ztRecord=new ZtRecord();
        ztRecord.setTaskId(ztTask.getId());
        ztRecord.setOperTime(LocalDateTime.now());
        ztRecord.setOperDesc(ztTask.getCrea()+LocalDateTime.now()+"创建任务");
        ztRecordMapper.insert(ztRecord);

        return ResultObject.success(ztTask);
    }
}
