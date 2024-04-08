package com.example.plus.service.impl;

import com.baomidou.mybatisplus.core.injector.methods.SelectById;
import com.example.plus.dao.PeopleMapper;
import com.example.plus.entity.Demo;
import com.example.plus.dao.DemoMapper;
import com.example.plus.entity.People;
import com.example.plus.service.DemoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhx
 * @since 2024年04月08日
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements DemoService {

}
