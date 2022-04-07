package com.org.ex0404;

public class BBB {
	
	public static void doA(Test te1) {
		te1.doA();
	}

	public static void main(String[] args) {
		doA(()->{System.out.println("익명함수");});
		Test test = new Test() {
			@Override
			public void doA() {
				System.out.println("doA");
			}
		};
		test.doA();
		Test te1 = ()->{
		      System.out.println("Welcome Heejin blog");
		};
		te1.doA();
	}
}
