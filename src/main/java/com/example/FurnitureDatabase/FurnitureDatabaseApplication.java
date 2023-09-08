package com.example.FurnitureDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FurnitureDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FurnitureDatabaseApplication.class, args);
		System.out.println("Connected");
	}

}
