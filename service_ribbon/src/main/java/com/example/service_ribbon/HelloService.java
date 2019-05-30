package com.example.service_ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hello(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name,String.class);
    }

    public String error(String name){
        return "hello,"+name+"! sorry,error";
    }
}
