package com.triplewill.exerciseapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.triplewill.model")
public class ExercisesAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ExercisesAppApplication.class, args);
	}
	
}
