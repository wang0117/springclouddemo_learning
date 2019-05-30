package com.example.eureka_server_8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8081Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8081Application.class, args);
    }

}
