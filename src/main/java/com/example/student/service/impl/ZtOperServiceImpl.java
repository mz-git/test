package com.example.student.service.impl;

import com.example.student.common.ResultObject;
import com.example.student.entity.ZtOper;
import com.example.student.entity.ZtRecord;
import com.example.student.entity.ZtTask;
import com.example.student.mapper.ZtOperMapper;
import com.example.student.mapper.ZtRecordMapper;
import com.example.student.mapper.ZtTaskMapper;
import com.example.student.service.ZtOperService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.student.vo.ZtCloseTaskVO;
import com.example.student.vo.ZtReviTaskVO;
import org.apache.catalina.startup.RealmRuleSet;
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
public class ZtOperServiceImpl extends ServiceImpl<ZtOperMapper, ZtOper> implements ZtOperService {

    @Autowired
    private ZtTaskMapper ztTaskMapper;
    @Autowired
    private ZtOperMapper ztOperMapper;
    @Autowired
    private ZtRecordMapper ztRecordMapper;

    @Override
    public ResultObject<ZtOper> getOperByTaskId(Long taskId) {
        ZtOper ztOper = ztOperMapper.getOperByTaskId(taskId);

        return ResultObject.success(ztOper);
    }

    @Override
    public ResultObject<ZtReviTaskVO> reviTask(ZtReviTaskVO ztReviTaskVO) {
        Long taskId = ztReviTaskVO.getTaskId();
        ZtOper ztOper=ztOperMapper.getOperByTaskId(taskId);
        if (ztOper == null){
            return ResultObject.error("该任务不存在!!");
        }
        if (!(ztOper.getStatus().equals("1001"))){
            return ResultObject.error("该任务状态码错误!!");
        }
//        System.out.println(ztOper.getStatus());//1001
//        System.out.println(!(ztOper.getStatus().equals("1001")));//false
        ztOper.setStatus("1002");
        ztOper.setReviTime(LocalDateTime.now());
        ztOperMapper.updateById(ztOper);

        ZtRecord ztRecord=new ZtRecord();
        ztRecord.setTaskId(taskId);
        ztRecord.setOperTime(LocalDateTime.now());
        ZtTask ztTask=ztTaskMapper.getTaskById(taskId);
        if (!(ztReviTaskVO.getRevi().equals(ztTask.getRevi()))){
            return ResultObject.error("当前用户不是评审人!");
        }
//        System.out.println(ztReviTaskVO.getRevi());//qq
//        System.out.println(ztTask.getRevi());//null
//        System.out.println(ztReviTaskVO.getRevi().equals(ztTask.getRevi()));//false
        ztRecord.setOperDesc(ztReviTaskVO.getRevi()+LocalDateTime.now()+"评审任务");
        ztRecordMapper.insert(ztRecord);

        return ResultObject.success(ztReviTaskVO);
    }

    @Override
    public ResultObject<Void> closeTask(ZtCloseTaskVO ztCloseTaskVO) {

        ZtOper ztOper=ztOperMapper.getOperByTaskId(ztCloseTaskVO.getTaskId());
        if (ztOper==null){
            return ResultObject.error("该任务不存在!!");
        }
        if (!(ztOper.getStatus().equals("1002"))){
            return ResultObject.error("该任务状态码错误!!");
        }
        ztOper.setStatus("1003");
        ztOper.setClosTime(LocalDateTime.now());
        ztOperMapper.updateById(ztOper);

        ZtRecord ztRecord = new ZtRecord();
        ztRecord.setTaskId(ztCloseTaskVO.getTaskId());
        ztRecord.setOperTime(LocalDateTime.now());
        ZtTask ztTask = ztTaskMapper.getTaskById(ztCloseTaskVO.getTaskId());
        if (!ztCloseTaskVO.getClos().equals(ztTask.getCrea())){
            return ResultObject.error("任务关闭人不是任务创建人!!");
        }
        ztRecord.setOperDesc(ztCloseTaskVO.getClos()+LocalDateTime.now()+"关闭任务");
        ztRecordMapper.insert(ztRecord);

        return ResultObject.success(null);
    }
}
