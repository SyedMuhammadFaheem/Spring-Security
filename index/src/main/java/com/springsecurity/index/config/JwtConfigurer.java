package com.springsecurity.index.config;

import com.springsecurity.index.security.JwtAuthenticationFilter;
import com.springsecurity.index.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;

@Configuration
@EnableWebSecurity
public class JwtConfigurer {

    private final JwtTokenProvider jwtTokenProvider;

    @Autowired
    public JwtConfigurer(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    public void configure(HttpSecurity http) throws Exception {
        http.addFilterBefore((Filter) new JwtAuthenticationFilter(jwtTokenProvider), Filter.class);
    }
}
