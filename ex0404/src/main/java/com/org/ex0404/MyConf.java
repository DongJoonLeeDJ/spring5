package com.org.ex0404;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyConf {

	@Bean
	public AA aa() {
		return new AA();
	}
	
	@Bean
	public DriverManagerDataSource dmd() {
		DriverManagerDataSource dmd = new DriverManagerDataSource();
		dmd.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmd.setUrl("jdbc:mysql://localhost:3306/spring5");
		dmd.setUsername("root");
		dmd.setPassword("1234");
		return dmd;
	}
	
	
}
