package com.learn.weik.demo.reflection.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/16-20:52
 */
@SpringBootTest
class SnowRobotTest {
    @Test
    public void snowRobotTest() {
        Robot.test(new SnowRobot("石头s9"));
    }

}