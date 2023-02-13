package com.learn.weik;

import com.learn.weik.demo.reflection.proxy.BigStar;
import com.learn.weik.demo.reflection.proxy.ProxyStar;
import com.learn.weik.demo.reflection.proxy.ProxyUtil;
import com.learn.weik.demo.reflection.proxy.Star;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Proxy;

/**
 * @author weikun
 * @Description 代理测试
 * @date 2023/02/12-10:55
 */
@SpringBootTest
public class ProxyTest {


/*     寻找代理人：经纪人( ProxyStar)
     开始调用代理人jdk.proxy2.$Proxy11| 执行代理方法：sing
     收费20w安排明天下午3点
     大名星刘德华正在唱《笨小孩》
     labial
     开始调用代理人jdk.proxy2.$Proxy11| 执行代理方法：dance
     跳舞收费10w安排明天下午2点半*/

    @Test
    public void proxyTest() {
        /*    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) {}
                                          ClassLoader: 类加载器 一般使用本类的类对象加载器
                                          Class<?>[] interfaces：接口类型数组
                                          InvocationHandler h：实现了InvocationHandler接口的类对象*/
        Star star = (Star) Proxy.newProxyInstance(
                ProxyTest.class.getClassLoader()
                , new Class[]{Star.class}
                , new ProxyUtil(new ProxyStar("经纪人", new BigStar("刘德华"))));
        System.out.println(star.sing("《笨小孩》"));
        star.dance();
    }
}
