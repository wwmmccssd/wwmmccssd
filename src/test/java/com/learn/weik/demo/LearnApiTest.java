package com.learn.weik.demo;

import io.github.cweijan.mock.Asserter;
import io.github.cweijan.mock.jupiter.HttpTest;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static io.github.cweijan.mock.Mocker.mock;

/**
 * @author
 * @Description TODO
 * @date -
 */
@HttpTest
class LearnApiTest {

    @Resource
    private LearnApi learnApi;


    @Test
    void postFormName() {
        String string = mock(String.class);
        String postFormName = learnApi.postFormName(string);
        Asserter.assertNotNull(postFormName);
    }
}
