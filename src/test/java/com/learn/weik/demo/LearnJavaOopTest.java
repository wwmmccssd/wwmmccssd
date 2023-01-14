package com.learn.weik.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/01/14-11:15
 */
@SpringBootTest
class LearnJavaOopTest {
    @Autowired
    LearnJavaOop learnJavaOop;

    @Test
    void primitiveType() {
        learnJavaOop.primitiveType('x');
        Character xc = learnJavaOop.primitiveType('x');
        learnJavaOop.primitiveTypeCheck('x');
        try {
            learnJavaOop.primitiveTypeCheck(null);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        assert xc != null;

    }
}