package com.upgrad.hirewheels;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HireWheelsApplicatonApplication {

	public static void main(String[] args) {

		//SpringApplication.run(HireWheelsApplicatonApplication.class, args);

		ApplicationContext context = SpringApplication.run(HireWheelsApplicatonApplication.class, args);

		@Bean
		CommandLineRunner init(InitService initService) {
			return args -> {
				initService.start();
			};
		}
	}

}
