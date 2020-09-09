package com.manipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.manipal")
public class TemperatureCalculatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureCalculatorServiceApplication.class, args);
	}

}