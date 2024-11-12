package com.webmaster.learnrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.webmaster.learnrestapi")
public class LearnSpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootRestApplication.class, args);
	}

}
