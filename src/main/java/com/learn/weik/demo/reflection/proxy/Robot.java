package com.learn.weik.demo.reflection.proxy;


import java.util.List;

/**
 * @author weikun
 * @Description
 * @date 2023/02/16-20:30
 */
public interface Robot {
    String name();

    String model();

    List<Operation> operations();

    static void test(Robot robot) {
        if (robot instanceof Null)
            System.out.println("[Null robot]");
        System.out.println("Robot name:" + robot.name());
        System.out.println("Robot model:" + robot.model());

        for (Operation op: robot.operations()) {
            System.out.println(op.description());
            op.command().run();
        }
    }
}
