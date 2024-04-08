package com.example.plus.dao;

import com.example.plus.entity.Demo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lhx
 * @since 2024年04月08日
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {

    Demo selectById(Serializable id);
}
