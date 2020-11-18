package com.rex.ribbion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbionApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbionApplication.class, args);
    }

}