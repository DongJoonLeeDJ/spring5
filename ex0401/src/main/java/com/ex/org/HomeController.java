package com.ex.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	A a;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println(a);
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@GetMapping("insert")
	public String insert() {
		// db �����ϴ� ��ü
		Connection con = null;
		// sql �� ��� ��ü
		PreparedStatement pstmt = null;
		try {
			// mysql ���̺귯�� �� ������Ʈ�� �ִ��� Ȯ��
			// java -> class -> jar
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DB ����
			con = DriverManager
					.getConnection
					("jdbc:mysql://localhost:3306/spring5", "root", "1234");
			// sql�� �ۼ�
			pstmt = con.prepareStatement(
					"insert into member "
					+ "(username,password) "
					+ "values "
					+ "('kk@naver.com','1223')");
			pstmt.executeUpdate(); // ����
			
			System.out.println("����");
		}catch (Exception e) {
			System.out.println(e);
		}
		return "insert";
	}
	
	
}
