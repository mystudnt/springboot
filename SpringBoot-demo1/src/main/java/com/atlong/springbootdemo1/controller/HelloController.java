package com.atlong.springbootdemo1.controller;

import com.atlong.springbootdemo1.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zzl
 * @Date: 2022/7/1 下午 5:07
 * @Version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car(){
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());
        return car;
    }
    @RequestMapping("/res/jj")
    public String xaio(){
        System.out.println("hhha");
        return "jfajf";
    }


}
