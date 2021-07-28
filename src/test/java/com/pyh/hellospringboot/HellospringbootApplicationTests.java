package com.pyh.hellospringboot;

import com.pyh.hellospringboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HellospringbootApplicationTests {

    @Autowired
    private User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
