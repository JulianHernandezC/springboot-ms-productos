package com.nttdata.app.msproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MSProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSProductosApplication.class, args);
	}

}
