package com.ansa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/*
https://www.javacodegeeks.com/2016/03/springboot-working-jdbctemplate.html
 */
@Configuration
public class AppConfig {
    @Autowired
    Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
