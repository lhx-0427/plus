package com.example.plus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@Accessors(chain = true)
@TableName("demo")
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 测试表
     */
    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("love")
    private String love;

    @TableField("time")
    private LocalDateTime time;


}
