package com.springsecurity.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class IndexApplication {


	public static void main(String[] args) {
		SpringApplication.run(IndexApplication.class, args);
	}

}
