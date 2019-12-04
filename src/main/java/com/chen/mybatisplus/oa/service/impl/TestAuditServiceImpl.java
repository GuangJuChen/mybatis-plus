package com.chen.mybatisplus.oa.service.impl;

import com.chen.mybatisplus.oa.entity.TestAudit;
import com.chen.mybatisplus.oa.mapper.TestAuditMapper;
import com.chen.mybatisplus.oa.service.ITestAuditService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 审批流程测试表 服务实现类
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@Service
public class TestAuditServiceImpl extends ServiceImpl<TestAuditMapper, TestAudit> implements ITestAuditService {

}
