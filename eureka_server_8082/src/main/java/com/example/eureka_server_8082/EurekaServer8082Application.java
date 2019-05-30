package com.example.eureka_server_8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8082Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8082Application.class, args);
    }

}
