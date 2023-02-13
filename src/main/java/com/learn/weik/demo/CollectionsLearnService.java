package com.learn.weik.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author weikun
 * @Description 集合学习
 * @date 2023/01/28-17:52
 */
@Service
public class CollectionsLearnService {
    static Queue<User> users = new LinkedList<>();
    static Collection<User> userCollection = new ArrayList<>();
    static {
        users.add(new User("张三", 22, 1));
        users.add(new User("李四", 33, 0));
        users.add(new User("王五", 12, 0));
        userCollection.add(new User("孙六",30,1));
        userCollection.add(new User("周卓",23,0));
        userCollection.add(new User("蒋八",22,0));
    }
//    public void
}
