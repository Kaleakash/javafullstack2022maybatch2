package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.medicare.entity")
@EnableJpaRepositories(basePackages = "com.medicare.repository")
public class MedicareBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicareBackendApplication.class, args);
		System.out.println("Server start on port number 8080");
	}

}
