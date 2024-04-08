package com.example.plus.service;

import com.baomidou.mybatisplus.core.injector.methods.SelectById;
import com.example.plus.entity.People;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.Serializable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lhx
 * @since 2024年04月08日
 */
public interface PeopleService extends IService<People> {
    @Override
    default People getById(Serializable id) {
        return IService.super.getById(id);
    }
}
