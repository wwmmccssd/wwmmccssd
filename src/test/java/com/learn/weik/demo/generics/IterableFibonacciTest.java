package com.learn.weik.demo.generics;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/25-12:11
 */
@SpringBootTest
class IterableFibonacciTest {
    @Test
    public void iterableFibonacciTest() {
        for (int i : new IterableFibonacci(18)
        ) {
            System.out.println(i);
        }
    }

}