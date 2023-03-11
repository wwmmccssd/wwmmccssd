package com.learn.weik.demo.generics;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/25-19:04
 */
@SpringBootTest
class SetsTest {
    @Resource
    private Sets sets;

    private static final Set<Integer> a = new HashSet<Integer>(),b = new HashSet<Integer>();
    static {
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(9);
        a.add(22);

        b.add(1);
        b.add(3);
        b.add(6);
        b.add(0);
        b.add(22);
    }

    @Test
    public void setSetsTest(){
        System.out.println("并集："+sets.union(a,b));
        System.out.println("交集:"+sets.intersection(a,b));
        System.out.println("a-b:"+sets.difference(a,b));
        System.out.println("差集:"+sets.complement(a,b));
    }

}