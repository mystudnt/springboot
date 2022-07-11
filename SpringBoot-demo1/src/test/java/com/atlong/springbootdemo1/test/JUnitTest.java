package com.atlong.springbootdemo1.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zzl
 * @Date: 2022/7/6 下午 4:56
 * @Version 1.0
 */
@DisplayName("Junit5测试类")
class JUnitTest {

@Test
@DisplayName("第一个测试")
    void firstTset(){

    assertEquals(1,1,"两个值不相等");
Object a = new Object();
Object b = new Object();
assertSame(a,b,"两个对象不相等");
}
}