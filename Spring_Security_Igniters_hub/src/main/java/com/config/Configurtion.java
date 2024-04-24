package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class Configurtion {
	@Bean //Authentication
	public InMemoryUserDetailsManager userDetail()//for checking diff user
	{
		UserDetails user=User.withDefaultPasswordEncoder()
				.username("root")
				.password("root")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
	
	public SecurityFilterChain filterChain(HttpSecurity http)throws Exception
	{  //Authorization
		http.authorizeHttpRequests((authz) -> authz
				//.requestMatchers("/message")
				.anyRequest()
				.authenticated()
				)
				.httpBasic();
		return http.build();
	}
} 
