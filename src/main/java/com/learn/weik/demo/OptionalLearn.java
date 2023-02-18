package com.learn.weik.demo;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author weikun
 * @Description Optional学习
 * @date 2023/02/13-21:46
 */
public class OptionalLearn {
    public static String getName(User u) {
        if (u == null || u.getName() == null)
            return "Unknown";
        return u.getName();
    }

    public String getNameByOptional(User u){
        return Optional.ofNullable(u).map(User::getName).orElse("Unknown");
    }

    public static String getChampionName(User comp) throws IllegalArgumentException {
        List<Operation> operations  = new ArrayList<>();
        return Optional.ofNullable(comp)
                .map(User::getName)
                .orElseThrow(() -> new IllegalArgumentException("The value of param comp isn't available."));
    }
//    public String getAuthToken(String u){
//        return Optional.ofNullable(u).map(ObjectMappe)
//    }
}
