package com.atlong.springbootdemo1.controller;

import com.atlong.springbootdemo1.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @Author: zzl
 * @Date: 2022/7/5 上午 10:23
 * @Version 1.0
 */
@Slf4j
@Controller
public class IndexController {
    @GetMapping({"/", "/login"})
    public String loginPage(){
        return "login";
    }
    @PostMapping("/login")
    public  String main(User user, HttpSession session, Model model){
        if (StringUtils.hasLength(user.getUsername()) && "123".equals(user.getPassword())){
            //把登陆的用户保存起来
            session.setAttribute("loginUser",user);
            //登录成功重定向到main.html，重定向防止表单重复提交
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","账号密码错误");
            log.info("提示信息{}",model);
        }
        return "login";
    }
    @GetMapping("/main.html")
    public String main(HttpSession session,Model model){
        log.info("当前方法是：{}","mainPage");
        //是否登录 拦截器 ，过滤器
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser == null) {
            model.addAttribute("msg","请重新登录");
            return "login";
        }else {
            return "main";
        }

    }
    @GetMapping("/basic_table")
    public String basicTable(){
        return "/table/basic_table";
    }
}
