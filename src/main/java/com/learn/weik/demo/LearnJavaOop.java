package com.learn.weik.demo;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

/**
 * @author weikun
 * @Description java oop
 * @date 2023/01/14-10:56
 */
@Service
@Validated
public class LearnJavaOop {

    /**
     *
     */
    public Character primitiveType(Character x){
        Character c = Character.valueOf(x);
        System.out.println(c);
        int x1 = c.compareTo('x');
        System.out.println(x1);
        boolean x2 = c.equals('x');
        System.out.println(x2);
        System.out.println(c.hashCode());
        System.out.println(c.getClass());


        return c;
    }
    public boolean primitiveTypeCheck(@NotNull("x不能为空！") Character x){
        Character c = Character.valueOf(x);
        System.out.println(c);
        return Optional.ofNullable(c).isPresent();
    }
}
