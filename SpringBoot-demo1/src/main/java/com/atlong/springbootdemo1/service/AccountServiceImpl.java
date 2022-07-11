package com.atlong.springbootdemo1.service;

import com.atlong.springbootdemo1.bean.Account;
import com.atlong.springbootdemo1.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 10:35
 * @Version 1.0
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountMapper accountMapper;
    @Override
    public Account queryAccountById(Long id) {
        return accountMapper.getAcct(id);
    }
}
