package com.example.springboot_eureka_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootEurekaClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaClient1Application.class, args);
    }

}
