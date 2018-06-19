package com.liumapp.demo.mybatis.complex.api.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file MybatisTestbConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@Configuration
@MapperScan(basePackages = {"com.liumapp.demo.mybatis.complex.api.testb"})
public class TestbMybatisConfig {



}
