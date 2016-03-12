package com.kss.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.kss.data")
@Configuration
public class CommonDataModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonDataModelApplication.class, args);
	}
}
