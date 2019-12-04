package com.chen.mybatisplus.sys.mapper;

import com.chen.mybatisplus.sys.entity.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 区域表 Mapper 接口
 * </p>
 *
 * @author chenGJ
 * @since 2019-12-03
 */
public interface AreaMapper extends BaseMapper<Area> {

    /**
     *
     * @return
     */
    List<Area> getAreaList();
}
