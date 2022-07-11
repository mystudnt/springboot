package com.atlong.springbootdemo1.test;

/**
 * @Author: zzl
 * @Date: 2022/7/4 下午 4:23
 * @Version 1.0
 */
public class SingletonClass {
    private static SingletonClass instance
            = new SingletonClass();
    public static SingletonClass getInstance(){
        return instance;
    }

    private SingletonClass() {
    }
}
