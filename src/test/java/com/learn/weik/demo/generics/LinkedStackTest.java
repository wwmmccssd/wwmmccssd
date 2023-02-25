package com.learn.weik.demo.generics;

import com.learn.weik.demo.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author weikun
 * @Description
 * @date 2023/02/18-20:51
 */
@SpringBootTest
class LinkedStackTest {
    @Test
    public void linkedStackTest() {
        LinkedStack<User> linkedStack = new LinkedStack<>();
        linkedStack.push(new User("a", 1, 1));
        linkedStack.push(new User("b", 2, 1));
        linkedStack.push(new User("c", 33, 0));
        linkedStack.push(new User("d", 44, 1));
        linkedStack.push(new User("e", 55, 0));
        linkedStack.push(new User("f", 2, 1));
        linkedStack.push(new User("g", 12, 0));
        linkedStack.push(new User("h", 16, 1));
        LinkedStack<String> stringLinkedStack = new LinkedStack<>();
        User u;
        while ((u = linkedStack.pop()) != null) {
            System.out.println(u);
            stringLinkedStack.push(u.getName());
        }
        for (String s : "hello world !".split(" ")) {
            System.out.println(s);
        }
    }

}