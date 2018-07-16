package com.example.configclientdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigclientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientdemoApplication.class, args);
	}


	@Value("${foo}")
	String str;

	@RequestMapping("/")
	public String demo(){
		return str;
	}

}
