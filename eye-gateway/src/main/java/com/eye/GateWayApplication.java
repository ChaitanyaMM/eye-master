package com.eye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com")
//@EnableZuulProxy
/*@EnableDiscoveryClient
@EnableAdminServer*/
public class GateWayApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}
	@RequestMapping(value="/")
	@ResponseBody
    public String home() {
        return "Hello Gateway!!...";
    }

}
