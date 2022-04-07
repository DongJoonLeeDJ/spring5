package chap2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConf {
	@Bean
	public AA aa() {
		AA a = new AA();
		return a;
	}
}
