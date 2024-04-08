package com.example.plus.service.impl;

import com.example.plus.entity.People;
import com.example.plus.dao.PeopleMapper;
import com.example.plus.service.PeopleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhx
 * @since 2024年04月08日
 */
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements PeopleService {
    @Autowired
    private PeopleMapper peopleMapper;
    public People selectById(Integer id){
        return peopleMapper.selectById(id);
    }
}
