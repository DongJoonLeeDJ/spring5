package com.org.ex0404.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.ex0404.dao.MemberDao;
import com.org.ex0404.dto.Member;
import com.org.ex0404.study.AA;

@Controller	
public class HomeController {
//	@Autowired
//	@Qualifier(value = "a1")
//	AA a1;
//	@Autowired
//	@Qualifier(value = "a2")
//	AA a2;
	
	@Autowired
	MemberDao dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("aaa",  LocalDateTime.now() );
//		System.out.println("a1 = "+a1);
//		System.out.println("a2 = "+a2);
//		System.out.println("a1 == a2 ? = "+(a1==a2));
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
	
	/*
	@PostMapping("delete")
	public String delete(HttpServletRequest request) {
		String id[] = request.getParameterValues("id");
		System.out.println("삭제 왔음..");
		return "redirect:select";
	}
	*/
	
	@PostMapping("delete")
	public String delete( @RequestParam(name = "id",required = false) Integer id[] ) {
		List<Integer> list = new ArrayList<Integer>();
		if(id !=null) {
			list = Arrays.asList(id);
			System.out.println(list);
			dao.delete(list);
		}
		else {
			System.out.println("id : null");
		}
		System.out.println("삭제 왔음..");
		return "redirect:select";
	}
	
	@GetMapping("update")
	public String update(int id,Model model) {
		Member member = dao.selectone(id);
		model.addAttribute("member", member);
		return "update";
	}
	
	@PostMapping("update")
	public String update( Member member ) {
//		requset.getParameter();
		//DB 에서 수정을...해야되고..
		System.out.println("일로오나..."+member);
		dao.update(member);
		return "redirect:select";
	}
}








