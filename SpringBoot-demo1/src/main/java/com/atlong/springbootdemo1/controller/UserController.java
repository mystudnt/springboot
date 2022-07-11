package com.atlong.springbootdemo1.controller;

import com.atlong.springbootdemo1.bean.User;
import com.atlong.springbootdemo1.service.Impl.UserServiceImpl;
import com.atlong.springbootdemo1.service.UserService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zzl
 * @Date: 2022/7/6 上午 11:04
 * @Version 1.0
 */
@Slf4j
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             @RequestParam(value = "pn",defaultValue = "1")Integer pn,
                             RedirectAttributes ra){
        userService.removeById(id);
     ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(@RequestParam(value = "pn",defaultValue = "1") Integer pn, HttpServletRequest request){
        //构造分页参数
        Page<User> page = new Page<>(pn,2);
        //调用page进行分页
        Page<User> userPage = userService.page(page,null);
        log.info("userPage是{}",userPage);
        List<User> records = userPage.getRecords();
        request.setAttribute("users",userPage);
        return "table/dynamic_table";

    }
}
