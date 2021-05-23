/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.enrollment.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author    ::asus
 * @Date      ::Apr 30, 2021
 * Description::
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.citi.membership.enrollment")
public class EnrollmentConfiguration {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	/*
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource1());
	}
	
	@Bean
	public DataSource dataSource1() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("java");
		return dataSource();
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("java");
		return dataSource();
	}
	*/
}
