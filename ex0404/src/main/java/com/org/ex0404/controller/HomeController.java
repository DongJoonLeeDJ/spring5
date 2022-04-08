package com.org.ex0404.controller;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.org.ex0404.dao.MemberDao;
import com.org.ex0404.dto.Member;
import com.org.ex0404.study.AA;

@Controller	
public class HomeController {
	@Autowired
	@Qualifier(value = "a1")
	AA a1;
	@Autowired
	@Qualifier(value = "a2")
	AA a2;
	@Autowired
	MemberDao dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("aaa",  LocalDateTime.now() );
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a1 == a2 ? = "+(a1==a2));
		return "home";
	}
	
	@GetMapping("insert")
	public String insert(Model model) {
		return "insert";
	}
	
	@PostMapping("insert")
	public String insert( Member member ) {
		dao.insert(member);
		return "redirect:select";
	}
	
	@GetMapping("select")
	public String select(Model model) {
		List<Member> list = dao.selectall();
		model.addAttribute("list", list);
		return "select";
	}
	
}
