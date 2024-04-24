package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity  // jha pr spring security ki 
					//configuration krni h vha ye add krte hai
public class SpringSecurityIgnitersHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityIgnitersHubApplication.class, args);
	}

}
