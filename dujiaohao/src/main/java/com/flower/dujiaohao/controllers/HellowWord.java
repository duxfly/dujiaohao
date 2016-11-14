package com.flower.dujiaohao.controllers;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flower.dujiaohao.services.IConsultService;

@Controller
public class HellowWord {
	@Resource
	private IConsultService consultService; 
	
	@RequestMapping("/helloword")
	public String hello(HttpServletRequest request,Model model){
		System.out.println("aaa");
		String id = request.getParameter("id");
		String username = consultService.getUsername(Long.valueOf(id));
		System.out.println(username+"+++++++++");
		model.addAttribute("username", username);
		return "success";
	}
}
