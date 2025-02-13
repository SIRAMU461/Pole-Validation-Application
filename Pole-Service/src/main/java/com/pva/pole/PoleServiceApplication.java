package com.pva.pole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PoleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoleServiceApplication.class, args);
		
		System.out.println("Pole Application is Started..!!");
	}

}
