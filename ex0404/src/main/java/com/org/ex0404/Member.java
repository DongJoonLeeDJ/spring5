package com.org.ex0404;


// command 객체..
// VO 객체...
// DTO 객체...
public class Member {
	private String username;
	private String password;

	// 기본생성자
	public Member() {}
	// allargs 생성자
	public Member(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Member [username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	// alt + shift + s  -> r getter setter 생성...
	// alt + shift + s -> s toStirng 생성
	// alt + shift + s -> o 생성자 생성
	
	
//	public void setUsername(String username) {
//		this.username = username;
//	}
}
