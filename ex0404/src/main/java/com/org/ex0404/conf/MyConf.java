package com.org.ex0404.conf;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.org.ex0404.dao.MemberDao;
import com.org.ex0404.study.AA;

@Configuration
@Import(MyMyConf.class)
public class MyConf {
//	@Bean
//	@Qualifier(value = "a1")
//	public AA a1() {
//		return new AA();
//	}
	
	@Bean
	@Qualifier(value = "a2")
	public AA a2() {
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
	
//	@Bean
//	public MemberDao dao() {
//		return new MemberDao();
//	}
	
}
