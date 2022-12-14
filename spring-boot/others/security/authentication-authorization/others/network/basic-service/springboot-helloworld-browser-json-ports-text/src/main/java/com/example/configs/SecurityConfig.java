package com.example.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.services.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
			
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http.authorizeRequests()
			.antMatchers("/").hasRole("USER")
		.and()
    		.httpBasic()
    	.and()
    		.csrf()
    			.disable();	

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {    	
    	auth
    		.userDetailsService(userDetailsService)
    		.passwordEncoder(new BCryptPasswordEncoder());
    } 

}
