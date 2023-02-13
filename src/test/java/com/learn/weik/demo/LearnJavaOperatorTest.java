package com.learn.weik.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author weik
 * @Description TODO
 * @date -
 */
@SpringBootTest
class LearnJavaOperatorTest {


    @Test
    void operatorTest() {
        LearnJavaOperator.operatorTest();
    }
    @Test
    void shortCircuitTest() {
        LearnJavaOperator.shortCircuit();
    }

    @Test
    void urShiftTest() {
        LearnJavaOperator.urShift();
    }
}
