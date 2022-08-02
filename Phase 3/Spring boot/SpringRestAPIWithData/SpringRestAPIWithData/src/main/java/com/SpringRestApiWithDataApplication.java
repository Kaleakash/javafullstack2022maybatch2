package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApiWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiWithDataApplication.class, args);
		System.out.println("Server up");
	}

}
