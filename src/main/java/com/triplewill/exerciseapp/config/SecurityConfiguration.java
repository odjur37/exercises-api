package com.triplewill.exerciseapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Value("${spring.auth.user}")
	private String user;
	@Value("${spring.auth.pwd}")
	private String password;
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.passwordEncoder(passwordEncoder())
			.withUser(user)
			.password(passwordEncoder().encode(password))
			.roles("USER");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		System.err.println("usr: " + user + " pwd: " + password);
		return passwordEncoder;
	}
	
}
