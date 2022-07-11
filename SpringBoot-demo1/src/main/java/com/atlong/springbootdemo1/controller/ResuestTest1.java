package com.atlong.springbootdemo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: zzl
 * @Date: 2022/7/4 上午 9:17
 * @Version 1.0
 */
@RestController
public class ResuestTest1 {
    @GetMapping("/user")
    public String getUser(){
        System.out.println("Get请求");
        return "Get请求";
    }
    @PostMapping("/user")
    public String postUser(){
        return "Post请求";
    }
    @DeleteMapping("/user")
    public  String deleteUser(){
        return "Delete请求";
    }
    @PutMapping("/user")
    public String putUser(){
        return "Put请求";
    }
}
