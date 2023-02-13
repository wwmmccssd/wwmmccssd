package com.learn.weik.demo.reflection.proxy;

import org.yaml.snakeyaml.util.EnumUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author weikun
 * @Description 代理公司
 * @date 2023/02/12-10:42
 */
public class ProxyUtil implements InvocationHandler {

    /**
     * 经纪人
     */
    public Object proxyStar;

    public ProxyUtil(Object proxyStar) {
        try {
//            1.proxyStar.getClass().getDeclaredField("name") 通过反射获取类属性"name"对象
//            2..get(proxyStar)再从proxyStar取得"name"的值
            System.out.println("寻找代理人：" + proxyStar.getClass().getDeclaredField("name").get(proxyStar) + "( " + proxyStar.getClass().getSimpleName() + ")");
        } catch (NoSuchFieldException e) {
            System.out.println("找不到代理人");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        this.proxyStar = proxyStar;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("开始调用代理人" + proxy.getClass().getName() + "| 执行代理方法：" + method.getName());
        return method.invoke(proxyStar, args);
    }

    /**
     * 创建代理
     */
    public void CreateProxy(String song) {
        /*    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h) {}
                                          ClassLoader: 类加载器 一般使用本类的类对象加载器
                                          Class<?>[] interfaces：接口类型数组
                                          InvocationHandler h：实现了InvocationHandler接口的类对象*/
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader()
                , new Class[]{Star.class}
                , new ProxyUtil(proxyStar));
        System.out.println(star.sing(song));
        star.dance();
        System.out.println(EnumUtils.findEnumInsensitiveCase(StarEnum.class, "成龙").toString());
        System.out.println(EnumUtils.findEnumInsensitiveCase(StarEnum.class, "成龙").ordinal());
        System.out.println(StarEnum.getIfPresent("潘子"));


    }
}
