package com.dineshonjava.bookshop.shopfrontui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ShopfrontUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopfrontUiApplication.class, args);
	}
}
