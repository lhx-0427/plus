package com.example.plus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lhx
 * @since 2024年04月08日
 */
@Getter
@Setter
public class People implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;


    private String car;


    private String home;


}
