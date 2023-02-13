package com.learn.weik.demo.reflection.proxy;

/**
 * @author weikun
 * @Description 大明星
 * @date 2023/02/12-10:25
 */
public class BigStar implements Star {
    public String name;

    public BigStar(String name) {
        this.name = name;
    }

    /**
     * 明星唱歌
     *
     * @param song
     * @return
     */
    @Override
    public String sing(String song) {
        System.out.println("大名星" + name + "正在唱" + song);
        return "labial";
    }

    /**
     * 明星跳舞
     *
     */
    @Override
    public void dance() {
        System.out.println("大名星" + name + "正在跳舞");
    }
}
