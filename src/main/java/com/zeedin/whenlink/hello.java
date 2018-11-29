package com.zeedin.whenlink;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping(value = "/")

    public String hello(){
        return  "hello world";
    }

}