package com.org.ex0404;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("aaa",  LocalDateTime.now() );
		
		return "home";
	}
	
	@GetMapping("insert")
	public String insert(Model model) {
		return "insert";
	}
	
	@PostMapping("insert")
	public String insert( @RequestParam String username, @RequestParam String password ) {
		System.out.println("username = "+username);
		System.out.println("password = "+password);
		System.out.println("여기에서 DB 저장 할계획");
		return "insert";
	}
	
//	@PostMapping("insert")
//	public String insert(HttpServletRequest request ) {
//		String u = request.getParameter("username");
//		String p = request.getParameter("password");
//		
//		System.out.println("여기에서 DB 저장 할계획");
//		return "insert";
//	}
	
	
}
