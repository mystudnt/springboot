package com.atlong.springbootdemo1.controller;

import com.atlong.springbootdemo1.bean.Account;
import com.atlong.springbootdemo1.service.AccountService;
import com.atlong.springbootdemo1.service.AccountServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 10:21
 * @Version 1.0
 */
@Controller
public class AccountController {
    @Autowired
    AccountService accountService;
   @GetMapping("/sql")
   @ResponseBody
    public Account queryAccountById(@RequestParam("id") Long id){

       return accountService.queryAccountById(id);
   }
}
