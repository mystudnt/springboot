package com.atlong.springbootdemo1.mapper;

import com.atlong.springbootdemo1.bean.Account;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 10:15
 * @Version 1.0
 */
@Mapper
public interface AccountMapper {
 public Account getAcct(Long id);

}
