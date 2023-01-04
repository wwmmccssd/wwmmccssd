package com.learn.weik.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author
 * @Description TODO
 * @date -
 */
@SpringBootTest
class LearnStreamServiceImplTest {

    @Autowired
    private LearnStreamServiceImpl learnStreamServiceImpl;


    @Test
    void getSort() {
        learnStreamServiceImpl.getSort();
    }
}
