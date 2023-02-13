package com.learn.weik.demo;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * @author weikun
 * @Description TODO
 * @date 2023/02/09-21:43
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

     public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object obj) {
        Class<?> type = obj.getClass();
        if (!baseType.isAssignableFrom(type)) {
            throw new IllegalArgumentException("Object " + obj + " is not of type " + baseType);
        }
        countClass(type);
    }

    private void countClass(Class<?> type) {
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);
        for (Class<?> superType = type.getSuperclass(); superType != null; superType = superType.getSuperclass()) {
            countClass(superType);
        }
    }

    @Override
    public String toString() {
        String collect = entrySet().stream().map(pair -> String.format("%s=%s", pair.getKey().getSimpleName(), pair.getValue())).collect(Collectors.joining(","));
        return "{" + collect + "}";
    }

}
