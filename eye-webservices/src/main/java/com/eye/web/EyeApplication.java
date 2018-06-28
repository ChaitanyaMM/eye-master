package com.eye.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@ComponentScan(basePackages = "com")
public class EyeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EyeApplication.class, args);
	}
	@RequestMapping(value="/")
	@ResponseBody
    public String home() {
        return "Hello Eye!!...";
    }
	

}
