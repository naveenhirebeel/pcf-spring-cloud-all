package com.example.eurekaserverpcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaServerPcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerPcfApplication.class, args);
	}

}
