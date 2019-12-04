package com.chen.mybatisplus.sys.service.impl;

import com.chen.mybatisplus.sys.entity.Log;
import com.chen.mybatisplus.sys.mapper.LogMapper;
import com.chen.mybatisplus.sys.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
