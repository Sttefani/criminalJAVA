package com.criminal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.criminal.repository"})
@EnableTransactionManagement
@EntityScan(basePackages = "com.criminal.model")
@ComponentScan(basePackages = {"com.*" })
public class CriminalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriminalApplication.class, args);
	}

}
