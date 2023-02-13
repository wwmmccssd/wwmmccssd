package com.learn.weik.demo;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.function.Predicate;

/**
 * @author weikun
 * @Description 运算符operator
 * @date 2023/01/14-23:29
 */
@Service
public class LearnJavaOperator {

    public static void operatorTest() {
        Random random = new Random(40);
        int i;
        int q = random.nextInt(80) + 5;
        System.out.println("q1:" + q);
        int m = random.nextInt(50, 100) + 10;
        System.out.println("m1:" + m);
        int c = random.nextInt(200, 500) + 33;
        System.out.println(c);
        i = c - m;
        System.out.println("c-m =" + i);

        i = q + m;
        System.out.println("q+m=" + i);

        i = c / q;
        System.out.println("c/q=" + i);

        i = q * m;
        System.out.println("q*m=" + i);
        i = c % q;
        System.out.println("c%q=" + i);

        q %= m;
        System.out.println("q%=" + q);

        float s, d, f;
        s = random.nextFloat();
        d = random.nextFloat();
        f = random.nextFloat();
        System.out.printf("s=%f, d=%f,f=%f%n", s, d, f);
        f = s + d;
        System.out.println("f1 = " + f);

        f = d - s;
        System.out.println("f2 = " + f);

        f = s * d;
        System.out.println("f3 = " + f);

        f = d / s;
        System.out.println("f4 = " + f);

        f = s % d;
        System.out.println("f5 = " + f);

        //一下对char,byte,short,int,long,double都适用
        s += d;
        System.out.println("s =" + s);
        s *= d;
        System.out.println("s=" + s);
        s /= d;
        System.out.println("s=" + s);
        s -= d;
        System.out.println("s=" + s);

        System.out.println(Integer.bitCount(4567));
        Integer integer = Integer.valueOf("8890");
        Integer integer2 = Integer.valueOf("8890");
        int is = 8890;
        System.out.println(integer.equals(is));
        System.out.println(integer == is);


    }

    /**
     * 短路
     */
    public static void shortCircuit() {
        Predicate<Integer> predicate = i -> {
            System.out.println(i);
            return i < 3;
        };
        System.out.println(predicate.test(1) && predicate.test(3) && predicate.test(4));
    }

    /**
     *
     */
    public static void urShift() {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));

        System.out.println(i >>> 10);
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

    }
}
