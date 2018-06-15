package com.liumapp.demo.mybatis.complex.service.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author liumapp
 * @file DatasourceConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/15/18
 */
@Configuration
public class DatasourceConfig {

    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource () {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "secondDataSource")
    @Qualifier("secondDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.second")
    public DataSource secondDataSource () {
        return DataSourceBuilder.create().build();
    }

}
