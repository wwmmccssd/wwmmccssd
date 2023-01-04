package com.learn.weik;

import com.learn.weik.demo.LearnApi;
import io.github.cweijan.mock.Asserter;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static io.github.cweijan.mock.Mocker.mock;

/**
 * @author
 * @Description TODO
 * @date -
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = LearnJavaApplication.class)
class LearnApiTest {

    @Autowired
    private LearnApi learnApi;


    @Test
    void postName() {
        String string = mock(String.class);
        String postName = learnApi.postName(string);
        Asserter.assertNotNull(postName);
    }

    @Test
    void getN() {
        String string = mock(String.class);
        String getN = learnApi.getN(string);
        Asserter.assertNotNull(getN);
    }

    @Test
    void getName() {
        String string = mock(String.class);
        String getName = learnApi.getName(string);
        Asserter.assertNotNull(getName);
    }

    @Test
    void testPostName() {
        String postName = learnApi.postName("weio");
        Asserter.assertNotNull(postName);
    }

    @Test
    void testGetN() {
    }

    @Test
    void testGetName() {
    }

    @Autowired
    private MockHttpServletRequest request;

//    @Test
//    void getRequest() {
//        MockHttpServletRequest request = new MockHttpServletRequest();
//        String string = mock(String.class);
//        request.setParameter("name",string);
//        learnApi.getRequest();
//    }
}
