package com.learn.weik.demo.reflection.proxy;

/**
 * @author weikun
 * @Description 代理类
 * @date 2023/02/12-10:49
 */
public class ProxyStar implements Star {

    /**
     * 代理人姓名
     */
    public String name;

    /**
     * 代理对象
     */
    public BigStar bigStar;

    /**
     * @param name 姓名
     * @param bigStar 代理人
     */
    public ProxyStar(String name, BigStar bigStar) {
        this.name = name;
        this.bigStar = bigStar;
    }

    @Override
    public String sing(String song) {
        System.out.println("收费20w"+"安排明天下午3点");
        return bigStar.sing(song);
    }

    @Override
    public void dance() {
        System.out.println("跳舞收费10w"+"安排明天下午2点半");
    }
}
