package com.telkommedika.ListDokter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ListDokterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListDokterApplication.class, args);
	}

}
