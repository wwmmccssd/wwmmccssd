package com.learn.weik.demo.reflection.proxy;

/**
 * @author weikun
 * @Description 明星接口
 * @date 2023/02/12-10:24
 */
public interface Star {

    /**
     * 唱歌
     * @param song
     * @return
     */
    String sing(String song);

    /**
     * 跳舞
     */
    void dance();
}
