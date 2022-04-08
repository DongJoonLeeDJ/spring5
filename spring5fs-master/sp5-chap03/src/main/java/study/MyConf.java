package study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {

	@Bean
	public ADao adao() {
		return new ADao();
	}
	
	@Bean
	public AService aservice() {
		return new AService(adao());
	}
	
}
