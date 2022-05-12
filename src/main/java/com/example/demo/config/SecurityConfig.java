package com.example.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests() // HttpServletRequest를 사용한 요청들에 대해 접근제한
            .antMatchers("/api/hello").permitAll() // 얘는 인증없어도 됨
            .anyRequest().authenticated(); // 나머지는 인증되어야 함
    }
    
}
