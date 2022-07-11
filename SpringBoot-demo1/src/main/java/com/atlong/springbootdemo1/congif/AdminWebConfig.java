package com.atlong.springbootdemo1.congif;

import com.atlong.springbootdemo1.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: zzl
 * @Date: 2022/7/5 下午 2:35
 * @Version 1.0
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") //所有请求都被拦截
                .excludePathPatterns
                        ("/","/login","/css/**","/fonts/**","/images/**","/js/**"); //放行请求
    }
}
