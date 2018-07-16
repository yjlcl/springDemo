package com.example.demo0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Demo0Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo0Application.class, args);
	}
}
