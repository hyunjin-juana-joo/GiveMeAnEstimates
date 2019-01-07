package com.juana.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class DataSourceConfig {
    @Bean(name = "dataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.jpa.database.datasource")
    public DataSource defaultDataSource(){
        return DataSourceBuilder.create().build();
    }
}
