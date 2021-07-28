package com.pyh.hellospringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello,springboot!I am pyh";
    }

    @RequestMapping("/pyh")
    public String pyh()
    {
        return "hello,pyh!";
    }
}
