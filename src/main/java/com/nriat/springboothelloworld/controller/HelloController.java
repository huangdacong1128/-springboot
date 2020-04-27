package com.nriat.springboothelloworld.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller


public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping({"/login","/","/index"})
    public String login()
    {
        return  "login";
    }
}
