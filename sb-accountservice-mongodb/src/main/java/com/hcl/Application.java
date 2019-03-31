package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.hcl.repository")
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(com.hcl.Application.class, args);
	}
	
	public void run() {
	}
}
