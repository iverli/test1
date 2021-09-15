package com.iverli.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


    @RequestMapping(value = "/index")
    public String sayHello(){
        System.out.println("test , index");
        return "index";
    }
}
