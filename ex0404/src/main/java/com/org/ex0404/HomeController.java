package com.org.ex0404;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.jdbc.Driver;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("aaa",  LocalDateTime.now() );
		
		return "home";
	}
	
	// a 태그... 이용해서... 주소줄에.. 직접적어도됩니다.
	@GetMapping("insert")
	public String insert(Model model) {
		return "insert";
	}
	
	// form태그 이용해서 method post
	@PostMapping("insert")
	public String insert( Member member ) {
		System.out.println(member);
		System.out.println("여기에서 DB 저장 할계획");
		
		// DB 연결객체
		
		// ctrl + shfit + o
		Connection con = null;
		// SQL 담는 객체
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring5", "root", "1234");
			pstmt = con.prepareStatement("insert into member (username, password) values (?,?)");
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		// response.sendRedict("test");
		return "redirect:select";
	}
	
	//jsp 같은 스프링... CRUD...
	@GetMapping("select")
	public String select() {
		
		return "select";
	}
	
//	@PostMapping("insert")
//	public String insert( @RequestParam String username, @RequestParam String password ) {
//		System.out.println("username = "+username);
//		System.out.println("password = "+password);
//		System.out.println("여기에서 DB 저장 할계획");
//		return "insert";
//	}
	
//	@PostMapping("insert")
//	public String insert(HttpServletRequest request ) {
//		request.setCharacterEncoding("utf-8");
//		String u = request.getParameter("username");
//		String p = request.getParameter("password");
//		System.out.println("여기에서 DB 저장 할계획");
//		return "insert";
//	}
	
	
}
