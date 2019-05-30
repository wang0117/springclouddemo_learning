package com.example.service_feign;

import org.springframework.stereotype.Component;

@Component
public class HystrixError implements HelloInterface{
    @Override
    public String sayHello(String name){
        return name+",sorry,error";
    }
}
