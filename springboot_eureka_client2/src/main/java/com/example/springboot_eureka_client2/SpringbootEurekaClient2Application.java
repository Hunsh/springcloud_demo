package com.example.springboot_eureka_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaClient2Application.class, args);
    }

}
