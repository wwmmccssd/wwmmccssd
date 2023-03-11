package com.learn.weik.demo.generics;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;


/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/25-11:57
 */
@SpringBootTest
class FibonacciTest {

    @Test
    public void fibTest() {
        Stream.generate(new Fibonacci()).limit(18).map(n -> n + "").forEach(System.out::println);

    }
}