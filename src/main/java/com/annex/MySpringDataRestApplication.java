package com.annex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringDataRestApplication.class, args);
		
		System.out.println("welcome");
	}

}
