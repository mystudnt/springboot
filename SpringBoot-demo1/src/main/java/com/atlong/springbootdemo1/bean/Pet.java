package com.atlong.springbootdemo1.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Controller;

/**
 * @Author: zzl
 * @Date: 2022/7/1 上午 11:05
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Controller
public class Pet {
    private String name;

}
