package com.school.zipup.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.OPTIONS;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(final WebSecurity web) throws Exception {
        web.ignoring()
                // Ignore the error mapped path
                .mvcMatchers("/error")

                // For the swagger UI
                .antMatchers(GET, "/v2/api-docs")
                .antMatchers(GET, "/swagger-resources/**")
                .antMatchers(GET, "/swagger-ui.html")
                .antMatchers(GET, "/webjars/**")
                .antMatchers(GET, "/")

                // Permit OPTIONS
                .antMatchers(OPTIONS, "/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().antMatchers("/").permitAll();
    }
}
