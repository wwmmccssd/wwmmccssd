package com.learn.weik.demo.reflection.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author weikun
 * @Description 反射会 绕过接口
 * @date 2023/02/16-22:27
 */
class demoImplTest {

    @Test
    void g() {
        demo demo = new demoImpl();
        demo.f();
//        demo.g(); error
        demoImpl d =  (demoImpl) demo;
        d.g();
    }
}