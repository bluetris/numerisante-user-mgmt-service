package com.numerisante.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.numerisante.usermgmt.repository" })
@ComponentScan(basePackages = { "com.numerisante.usermgmt"})
public class UsermgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermgmtApplication.class, args);
	}

}
