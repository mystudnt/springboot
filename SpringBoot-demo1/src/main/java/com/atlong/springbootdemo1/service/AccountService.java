package com.atlong.springbootdemo1.service;

import com.atlong.springbootdemo1.bean.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 10:21
 * @Version 1.0
 */

public interface AccountService {
     Account queryAccountById(Long id);

}
