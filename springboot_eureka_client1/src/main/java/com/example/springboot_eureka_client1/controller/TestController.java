package com.example.springboot_eureka_client1.controller;

import com.netflix.client.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Jdz
 * @create: 2020/6/29 17:24
 * @Copyright:
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "port:8762";
    }
}
