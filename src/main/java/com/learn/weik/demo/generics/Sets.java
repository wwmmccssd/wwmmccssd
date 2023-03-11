package com.learn.weik.demo.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author weikun
 * @Description 用set 表示数学关系
 * @date 2023/02/25-18:47
 */
public class Sets {
    /**
     * 取并集
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        Set<T> set = new HashSet<>(a);
        set.addAll(b);
        return set;
    }

    /**
     * 取交集
     */
    public static<T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> set = new HashSet<>(a);
        set.retainAll(b);
        return set;
    }

    /**
     * 从superset这个集合中移除subset的元素
     */
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset){
        Set<T> tSet = new HashSet<>(superset);
        tSet.removeAll(subset);
        return tSet;
    }

    /**
     * 差集合
     */
    public static <T> Set<T> complement(Set<T> a, Set<T> b){
        return difference(union(a,b),intersection(a,b));
    }
}
