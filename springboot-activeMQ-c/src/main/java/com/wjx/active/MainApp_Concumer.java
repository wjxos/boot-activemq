package com.wjx.active;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MainApp_Concumer {
	
	public static void main(String[] args) {
		SpringApplication.run(MainApp_Concumer.class, args);
	}

}
