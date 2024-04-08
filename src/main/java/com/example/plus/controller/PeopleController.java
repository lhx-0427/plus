package com.example.plus.controller;


import com.example.plus.dao.PeopleMapper;
import com.example.plus.entity.People;
import com.example.plus.service.impl.PeopleServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lhx
 * @since 2024年04月08日
 */
@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleServiceImpl peopleService;
    @RequestMapping("/{id}")
     public People getById(@PathVariable Integer id){

        return peopleService.selectById(id);
     }
}

