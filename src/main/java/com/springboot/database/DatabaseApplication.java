package com.springboot.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DatabaseApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(DatabaseApplication.class);
		}

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
}
