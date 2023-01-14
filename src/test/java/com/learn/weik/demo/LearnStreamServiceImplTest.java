package com.learn.weik.demo;

import io.github.cweijan.mock.Asserter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

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

    @Test
    void testFilter() {
        learnStreamServiceImpl.testFilter(u -> u.getGender().equals(1) && u.getAge() <= 25);
    }

    @Test
    void getMansAverageAge() {
        learnStreamServiceImpl.getMansAverageAge();
    }

    @Test
    void testPredicate() {
        learnStreamServiceImpl.testPredicate();
    }

    @Test
    void testCurry() {
        learnStreamServiceImpl.testCurry();
    }

    @Test
    void getIntsStream() {
        IntStream getIntsStream = learnStreamServiceImpl.getIntsStream();
        Asserter.assertNotNull(getIntsStream);
        Asserter.assertEquals(getIntsStream.count(),20);
    }
}
