package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafIntroApplication.class, args);
		//say hello 
		System.out.println("hey working...");
	}

}
