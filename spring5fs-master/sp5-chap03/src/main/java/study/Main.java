package study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// 1 어노테이션방식 Spring 5버전...
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(MyConf.class);
		
		// adao를 insert, insert 두번...하고
		AService aservice = acac.getBean(AService.class);
		aservice.reg(new A("a11","b11"));
		aservice.reg(new A("a22","b22"));
		
		// adao를 가지고 select...
		aservice.select();
		
		acac.close();
		
		// 2 XML SPring 3버전...
//		GenericXmlApplicationContext gxac = new GenericXmlApplicationContext("MyConf.xml");
		
		
		
	}
}
