package com.upgrad.hirewheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HireWheelsApplicatonApplication {

	public static void main(String[] args) {

		//SpringApplication.run(HireWheelsApplicatonApplication.class, args);

		ApplicationContext context = SpringApplication.run(HireWheelsApplicatonApplication.class, args);
	}

}
