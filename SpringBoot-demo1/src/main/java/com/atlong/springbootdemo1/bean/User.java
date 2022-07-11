package com.atlong.springbootdemo1.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author: zzl
 * @Date: 2022/7/1 上午 11:04
 * @Version 1.0
 */
@Data
@Component
@TableName("t_user")
public class User {
    private Integer id;
    private String username;
    private String  password;
    private String email;
    private Integer did;
}
