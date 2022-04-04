package com.ex.org;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {

	@Bean
	public A a(){
		return new A();
	}
}
