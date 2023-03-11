package com.learn.weik.demo.enums;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/03/05-17:24
 */
@SpringBootTest
class BurritoTest {
    @Test
    public void burritoTest() {
        System.out.println(new Burrito(SpicinessEnum.NOT));
        System.out.println(new Burrito(SpicinessEnum.MILD));
        System.out.println(new Burrito(SpicinessEnum.MEDIUM));
        System.out.println(new Burrito(SpicinessEnum.HOT));
        System.out.println(new Burrito(SpicinessEnum.FLAMING));
    }

}