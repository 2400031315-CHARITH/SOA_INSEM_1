package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@EnableEurekaServer

public class S59MsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S59MsEurekaServerApplication.class, args);
	}

}
