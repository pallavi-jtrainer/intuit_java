package com.springpeople.SpringCoreCrudDemo.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.springpeople.SpringCoreCrudDemo")
public class AppConfig {
	
	private final String URL = "jdbc:mysql://localhost:3306/springjdbc_db";
	private final String USER = "jdbc_user";
	private final String PASSWORD = "Pass1234";
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource driverManager = new DriverManagerDataSource();
		driverManager.setDriverClassName(DRIVER);
		driverManager.setUrl(URL);
		driverManager.setUsername(USER);
		driverManager.setPassword(PASSWORD);
		return driverManager;
	}
	
	
	
}
