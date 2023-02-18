package com.learn.weik.demo.reflection.proxy;


import java.lang.reflect.Proxy;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/16-21:20
 */
public class NullRobot {

    public static Robot NewNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{Robot.class, Null.class}, new NullRobotProxyHandler(type)
        );
    }

}
