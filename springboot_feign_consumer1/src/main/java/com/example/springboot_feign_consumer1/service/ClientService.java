package com.example.springboot_feign_consumer1.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Jdz
 * @create: 2020/6/29 17:47
 * @Copyright:
 */
@FeignClient(value = "service-hi")
public interface ClientService {
    @GetMapping(value = "/hi")
    String test();
}
