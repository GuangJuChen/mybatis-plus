package com.chen.mybatisplus.sys.service.impl;

import com.chen.mybatisplus.sys.entity.User;
import com.chen.mybatisplus.sys.mapper.UserMapper;
import com.chen.mybatisplus.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
