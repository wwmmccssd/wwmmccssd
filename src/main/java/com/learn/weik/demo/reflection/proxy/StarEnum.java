package com.learn.weik.demo.reflection.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.NoSuchElementException;

/**
 * @author weikun
 * @Description 枚举学习
 * @date 2023/02/12-19:27
 */
@Getter
@AllArgsConstructor
@ToString
public enum StarEnum {
    /**
     * 明星
     */
    LDH_STAR("刘德华", "《笨小孩》"),
    ZBS_STAR("赵本山", "《卖拐》"),
    CL_STAR("成龙", "《美丽的神话》");
    private String name;
    private String song;

    /**
     * 是否存在该枚举
     *
     * @param str
     * @return
     */
    public static boolean getIfPresent(String str) {
        for (StarEnum starEnum : StarEnum.values()) {
            if (starEnum.getName().equals(str) || starEnum.getSong().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 根据明星找歌曲
     *
     * @param name
     * @return
     */
    public static String getFindByName(String name) {
        for (StarEnum starEnum : StarEnum.values()) {
            if (starEnum.getName().equals(name)) {
                return starEnum.getSong();
            }
        }
        throw new NoSuchElementException("找不到该明星");
    }

    /**
     * 根据歌曲寻找明星
     *
     * @param song
     * @return
     */
    public static String getFindBySong(String song) {
        for (StarEnum starEnum : StarEnum.values()) {
            if (starEnum.getSong().equals(song)) {
                return starEnum.getName();
            }
        }
        throw new NoSuchElementException("找不到该明星");
    }
}
