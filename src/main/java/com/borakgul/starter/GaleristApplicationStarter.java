package com.borakgul.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.borakgul"})
@EntityScan(basePackages = {"com.borakgul"})
@EnableJpaRepositories(basePackages = {"com.borakgul"})
public class GaleristApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(GaleristApplicationStarter.class, args);
	}

}
