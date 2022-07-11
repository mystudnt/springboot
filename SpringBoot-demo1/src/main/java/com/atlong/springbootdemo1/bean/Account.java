package com.atlong.springbootdemo1.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 10:09
 * @Version 1.0
 */
@Data
public class Account {
    private Integer id;
    private String username;
    private BigDecimal money;
}
