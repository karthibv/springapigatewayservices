package com.kk.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApiServiceregistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiServiceregistryApplication.class, args);
	}
}


