package com.learn.weik.demo.reflection.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/16-21:12
 */
public class NullRobotProxyHandler implements InvocationHandler {
    private String nullName;

    private final Robot proxied = new NRobot();

    public NullRobotProxyHandler(Class<? extends Robot > type) {
        nullName = type.getSimpleName() + "NullRobot";
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied,args);
    }

    private class NRobot implements Robot, Null {

        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }
}
