package com.learn.weik.demo.generics;

import java.util.function.Supplier;

/**
 * @author weikun
 * @Description 生成斐波那契数列
 * @date 2023/02/25-11:53
 */
public class Fibonacci implements Supplier<Integer> {
    private int count = 0;

    @Override
    public Integer get() {
        return fib(count++);
    }

    /**
     * 递归计算
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
