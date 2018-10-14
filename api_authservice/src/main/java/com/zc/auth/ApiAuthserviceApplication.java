package com.zc.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@ComponentScan(basePackages = "com.zc")

@SpringBootApplication
public class ApiAuthserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAuthserviceApplication.class, args);
	}
}
