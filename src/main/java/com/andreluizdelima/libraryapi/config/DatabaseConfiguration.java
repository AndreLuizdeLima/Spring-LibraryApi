package com.andreluizdelima.libraryapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Value("${spring.datasource.url")
    String url;

    @Value("${spring.datasource.username")
    String username;

    @Value("${spring.datasource.password")
    String password;

    @Value("${spring.datasource.driver-class-name")
    String driver;

    @Bean
    public DataSource datasource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        return null;
    }
}
