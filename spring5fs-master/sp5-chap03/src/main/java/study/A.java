package study;

public class A {
	private String a;
	private String b;
	
	// alt + shift + s
	// 1. getter setter
	// 2. constructor
	// 3. tostring
	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + "]";
	}

	public A(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
}
