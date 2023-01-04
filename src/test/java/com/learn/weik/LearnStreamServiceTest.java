package com.learn.weik;

import com.learn.weik.demo.LearnStreamService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author
 * @Description TODO
 * @date -
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LearnJavaApplication.class)
class LearnStreamServiceTest {

    @Autowired
    private LearnStreamService learnStreamService;


    @Test
    void streamGroupBy() {
        learnStreamService.streamGroupBy();
    }
}
