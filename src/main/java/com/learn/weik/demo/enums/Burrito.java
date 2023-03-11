package com.learn.weik.demo.enums;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/03/05-17:21
 */
public class Burrito {
    /**
     * 程度
     */
    SpicinessEnum degree;

    public Burrito(SpicinessEnum degree) {
        this.degree = degree;
    }
    @Override
    public String toString() {
        return "Burrito is " + degree;
    }
}
