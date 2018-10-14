package com.kk.emailsrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//https://github.com/isilona/microservices
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.zc,com.kk")
public class EmailserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailserviceApplication.class, args);
	}
}
