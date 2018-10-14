package com.kk.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiCustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCustomerserviceApplication.class, args);
	}
}
