package com.vj.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World \n Access : http://localhost:9090/swagger-ui.html#/";
    }
}
