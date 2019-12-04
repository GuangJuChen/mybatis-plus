package com.chen.mybatisplus.sys.service.impl;

import com.chen.mybatisplus.sys.entity.Role;
import com.chen.mybatisplus.sys.mapper.RoleMapper;
import com.chen.mybatisplus.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
