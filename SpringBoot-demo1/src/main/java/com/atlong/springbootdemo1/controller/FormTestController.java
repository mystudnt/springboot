package com.atlong.springbootdemo1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author: zzl
 * @Date: 2022/7/5 下午 3:09
 * @Version 1.0
 */
//文件上传测试
    @Controller
    @Slf4j
public class FormTestController {
        @GetMapping("/form_layouts")
    public String form_layouts(){
            return "/form/form_layouts";
        }
        @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestParam("headerImg") MultipartFile headerImg,
                         @RequestParam("photos") MultipartFile[] photos) throws IOException {

            log.info("上传的信息：email={}，username={}，headerImg={}，photos={}",
                    email,username,headerImg.getSize(),photos.length);
            if (!headerImg.isEmpty()){
                //如果headerImg有内容 保存文件到服务器
                String originalFilename = headerImg.getOriginalFilename();
                headerImg.transferTo(
                        new File("D:\\IDM\\code\\springboot\\SpringBoot-demo1\\src\\main\\resources\\haha\\" + originalFilename));
            }
            if (photos.length > 0){
                for (MultipartFile photo : photos) {
                    if (!photo.isEmpty())
                    photo.transferTo(
                            new File("D:\\IDM\\code\\springboot\\SpringBoot-demo1\\src\\main\\resources\\haha\\"+ photo.getOriginalFilename()) );
                }
            }
            return "main";
        }

}
