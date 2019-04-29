package com.example.student.service;

import com.example.student.common.ResultObject;
import com.example.student.entity.ZtOper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.student.vo.ZtCloseTaskVO;
import com.example.student.vo.ZtReviTaskVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JMZ
 * @since 2019-04-28
 */
public interface ZtOperService extends IService<ZtOper> {

    ResultObject<ZtOper> getOperByTaskId(Long taskId);

    ResultObject<ZtReviTaskVO> reviTask(ZtReviTaskVO ztReviTaskVO);

    ResultObject<Void> closeTask(ZtCloseTaskVO ztCloseTaskVO);
}
