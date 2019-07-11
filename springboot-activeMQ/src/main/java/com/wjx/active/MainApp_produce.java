package com.wjx.active;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MainApp_produce {
	
	public static void main(String[] args) {
		SpringApplication.run(MainApp_produce.class, args);
	}

}
