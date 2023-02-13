package com.learn.weik.demo;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
    public Character primitiveType(char x){
        Character c = x;
        System.out.println(c);
        int x1 = c.compareTo('x');
        System.out.println(x1);
        boolean x2 = c.equals('x');
        System.out.println(x2);
        System.out.println(c.hashCode());
        System.out.println(c.getClass());

        double f =  10f/3f;
        System.out.println(String.format("%.15f",f));

        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        String format = decimalFormat.format(10f / 3f);

        System.out.println("format:"+format);

        // scale 是精度 roundingMode是舍入模式（2舍3入）
        System.out.println("BigDecimal.divide:"+new BigDecimal(1).divide(new BigDecimal(3),8,BigDecimal.ROUND_CEILING));


        return c;
    }
    public static boolean primitiveTypeCheck(Character x){
        System.out.println(x);
        return Optional.ofNullable(x).isPresent();
    }

    public static void systemTest(){
        System.getProperties().list(System.out);
        System.out.println("----1-----");
        System.out.println(System.getProperty("user.name"));
        System.out.println("----2-----");
        System.out.println(
                System.getProperty("java.library.path")
        );

    }

    public static void stringTest() {
        String xx = new String("xx");
        String bb = new String("xx");
        assert xx.equals(bb);
        System.out.println(xx.hashCode());
        System.out.println(bb.hashCode());
    }
}
