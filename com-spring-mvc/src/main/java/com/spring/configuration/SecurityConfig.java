package com.spring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication().withUser("kalyani92moharil@gmail.com").password("kalyani").authorities("ROLE_ADMIN");
		
	}
 @Override
 public void configure(HttpSecurity http) throws Exception {
	 http
	 .authorizeRequests()
	 .antMatchers("/homePage").access("hasRole('ROLE_ADMIN')")
	 .and()
	 .formLogin()
	 .defaultSuccessUrl("/success")
	 .defaultSuccessUrl("/failure");
	 
 }
}
