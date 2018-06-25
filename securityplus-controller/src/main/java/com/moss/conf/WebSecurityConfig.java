package com.moss.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private CustomerSuccessHandler customerSuccessHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .formLogin().loginProcessingUrl("/login")
            .successHandler(customerSuccessHandler)
            .and()
                .authorizeRequests().anyRequest().authenticated()
            .and()
                .csrf().disable();

    }
}
