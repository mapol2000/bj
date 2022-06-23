package com.flatnine.bj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our users for in memory authentication
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("john").password("qwer1234").roles("EMPLOYEE"))
			.withUser(users.username("cindy").password("qwer1234").roles("EMPLOYEE", "MANAGER"))
			.withUser(users.username("peter").password("qwer1234").roles("EMPLOYEE", "ADMIN"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
			.antMatchers("/customers/showForm*").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/customers/save*").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/customers/delete").hasRole("ADMIN")
			.antMatchers("/customers/**").hasRole("EMPLOYEE")
			.antMatchers("/products/showForm*").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/products/save*").hasAnyRole("MANAGER", "ADMIN")
			.antMatchers("/products/delete").hasRole("ADMIN")
			.antMatchers("/products/**").hasRole("EMPLOYEE")
			.antMatchers("/resources/**").permitAll()
			.and()
			.formLogin()
				.loginPage("/showMyLoginPage")
				.loginProcessingUrl("/authenticateTheUser")
				.permitAll()
			.and()
			.logout().permitAll()
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");
		
	}
		
}






