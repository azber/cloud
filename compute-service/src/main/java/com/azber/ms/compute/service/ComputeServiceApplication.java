package com.azber.ms.compute.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComputeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputeServiceApplication.class, args);
	}
}
