package com.learn.weik.demo.reflection.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.util.EnumUtils;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/13-19:22
 */
@SpringBootTest
class StarEnumTest {
    StarEnum starEnum;

    @Test
    void getIfPresent() {
        //返回枚举对象的name属性
        System.out.println(EnumUtils.findEnumInsensitiveCase(StarEnum.class, "LDH_STAR").getName());
        //返回枚举对象序列
        System.out.println(EnumUtils.findEnumInsensitiveCase(StarEnum.class, "CL_STAR").ordinal());
        //是否存在
        System.out.println(StarEnum.getIfPresent("潘子"));
    }

    @Test
    void getFindByName() {
        System.out.println(StarEnum.getFindByName("赵本山"));
    }

    @Test
    void getFindBySong() {
        System.out.println(StarEnum.getFindBySong("《笨小孩》"));
        Integer a = 100;
        Integer b = 100;
        Integer c = 150;
        Integer d = 150;
        System.out.println( a == b);
        System.out.println(c == d);

    }
}