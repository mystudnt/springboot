package com.atlong.springbootdemo1.service.Impl;

import com.atlong.springbootdemo1.bean.User;
import com.atlong.springbootdemo1.mapper.UserMapper;
import com.atlong.springbootdemo1.service.UserService;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 11:15
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
