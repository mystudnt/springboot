package com.atlong.springbootdemo1.mapper;

import com.atlong.springbootdemo1.bean.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 11:05
 * @Version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
