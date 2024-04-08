package com.example.plus.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.injector.methods.SelectById;
import com.example.plus.entity.People;
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
public interface PeopleMapper extends BaseMapper<People> {

    People selectById(Serializable id);
}
