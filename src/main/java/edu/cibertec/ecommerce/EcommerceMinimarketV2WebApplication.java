package edu.cibertec.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class EcommerceMinimarketV2WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMinimarketV2WebApplication.class, args);
	}

}
