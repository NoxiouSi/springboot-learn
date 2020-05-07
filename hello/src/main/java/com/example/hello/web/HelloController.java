package com.example.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello world!";
    }

    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100/0;
    }
}
