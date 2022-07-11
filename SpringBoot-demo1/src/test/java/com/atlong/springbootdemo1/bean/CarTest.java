package com.atlong.springbootdemo1.bean;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: zzl
 * @Date: 2022/7/1 下午 5:02
 * @Version 1.0
 */
class CarTest {

    @Test
    void getBrand() {
        int[] arr = {12,45,9,67,455};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -j; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    @Test
    public void recursiveBubble() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class<?> aClass = Class.forName("com.atlong.springbootdemo1.bean.User");
        Object he = aClass.getDeclaredConstructor();
        int[] arr = {12,45,9,67,455};
        User user = new User();
        Class<? extends User> userClass = user.getClass();

    }

}