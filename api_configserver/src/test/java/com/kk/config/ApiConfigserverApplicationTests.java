package com.kk.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootTest
public class ApiConfigserverApplicationTests {

	@Test
	public void contextLoads() {
	}

}
