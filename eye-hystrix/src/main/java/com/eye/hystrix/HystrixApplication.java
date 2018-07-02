package com.eye.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}
	@RequestMapping(value="/")
	@ResponseBody
    public String home() {
        return "Hello im hystrix!!...";
    }
	

}
