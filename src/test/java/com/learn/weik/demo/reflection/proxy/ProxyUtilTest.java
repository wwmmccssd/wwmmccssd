package com.learn.weik.demo.reflection.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author weikun
 * @Description 动态代理
 * @date 2023/02/12-16:30
 */
@SpringBootTest
class ProxyUtilTest {
    private ProxyUtil proxyUtil = new ProxyUtil(new ProxyStar("经纪人",new BigStar("刘德华")));
    private ProxyUtil proxyUtil2 = new ProxyUtil(new ProxyStar("经纪人2",new BigStar("赵本山")));
    @Test
    public void proxyTest(){
        proxyUtil.CreateProxy("《笨小孩》");
        System.out.println("----------------");
        proxyUtil2.CreateProxy("《卖拐》");

    }

}