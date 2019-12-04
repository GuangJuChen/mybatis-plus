package com.chen.mybatisplus.sys.service.impl;

import com.chen.mybatisplus.sys.entity.UserRole;
import com.chen.mybatisplus.sys.mapper.UserRoleMapper;
import com.chen.mybatisplus.sys.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色 服务实现类
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
