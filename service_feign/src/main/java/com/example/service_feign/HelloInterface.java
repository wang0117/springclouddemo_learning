package com.example.service_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = HystrixError.class)
public interface HelloInterface {
    @RequestMapping("/hello")
    String sayHello(@RequestParam(value="name") String name);
}
