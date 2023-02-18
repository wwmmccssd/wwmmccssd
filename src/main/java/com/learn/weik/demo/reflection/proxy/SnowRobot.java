package com.learn.weik.demo.reflection.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/16-20:43
 */
public class SnowRobot implements Robot {

    private String name;

    public SnowRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return name + "SnowRobot Series 11";
    }

    private List<Operation> operations = Arrays.asList(
            new Operation(
                    () -> name + "我能扫雪！",
                    () -> System.out.println(name + "去扫雪！")
            ),
            new Operation(
                    () -> name + " 可以打碎冰！",
                    () -> System.out.println(name + "碎冰！")
            ),
            new Operation(
                    () -> name + "可以打扫屋顶！",
                    () -> System.out.println(name + "清洁屋顶！")
            )
    );

    @Override
    public List<Operation> operations() {
        return operations;
    }
}
