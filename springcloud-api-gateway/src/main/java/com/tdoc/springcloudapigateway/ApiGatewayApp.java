package com.tdoc.springcloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class ApiGatewayApp {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApp.class, args);
	}

}
