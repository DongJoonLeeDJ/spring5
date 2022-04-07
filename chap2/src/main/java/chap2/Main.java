package chap2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	// 경량 컴포넌트다.. 가볍다.. 싱글톤... 
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a1 == a2 ? "+(a1==a2));
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConf.class);
		
		AA a3 = ctx.getBean(AA.class);
		AA a4 = ctx.getBean(AA.class);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);
		System.out.println("a3 == a4 ? "+(a3==a4));
		
		a3.doA();
		a4.doB();
		
		ctx.close();
	}
}
