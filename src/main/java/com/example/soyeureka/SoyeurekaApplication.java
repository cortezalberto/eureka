package com.example.soyeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SoyeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoyeurekaApplication.class, args);
		System.out.println("Levantado eureka");
		;
	}

}
