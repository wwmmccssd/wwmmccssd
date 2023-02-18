package com.learn.weik.demo.reflection.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/16-21:23
 */
@SpringBootTest
class NullRobotTest {

    @Test
    void newNullRobot() {
        Stream.of(new SnowRobot("扫雪石头一号"), NullRobot.NewNullRobot(SnowRobot.class),new SnowRobot("冰雪三号")).forEach(Robot::test);
    }
}