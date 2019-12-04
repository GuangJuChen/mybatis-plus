package com.chen.mybatisplus.sys.service.impl;

import com.chen.mybatisplus.sys.entity.Menu;
import com.chen.mybatisplus.sys.mapper.MenuMapper;
import com.chen.mybatisplus.sys.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
