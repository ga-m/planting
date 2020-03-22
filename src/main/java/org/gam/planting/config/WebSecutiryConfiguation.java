package org.gam.planting.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecutiryConfiguation extends WebSecurityConfigurerAdapter {
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // Enable h2-console
        http.authorizeRequests().antMatchers("/h2-console/*").permitAll();
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
