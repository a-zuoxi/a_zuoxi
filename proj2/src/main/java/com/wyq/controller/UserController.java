package com.wyq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wyq.entity.User;
import com.wyq.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/*
	@RequestMapping("/users")
	public ModelAndView users(ModelAndView mv) {
		List<User> users = userService.findAll();
		mv.addObject("users", users);
		mv.setViewName("users");
		return mv;
	}

	@RequestMapping("/input")
	public String input() {
		return "input";
	}

	@RequestMapping("/save")
	public String save(User user) {
		userService.save(user);
		return "redirect:/users";
	}
	*/
	
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	
	@RequestMapping("/judgment")
	public String judgment(User theuser) {
		String uname=theuser.getUname();
		String pwd=theuser.getPwd();
	
		User user=userService.login(uname, pwd);
		if (user!=null) return "login_fail";
		else return "login_success";
	}
	

	@RequestMapping("/dom")
	public String dom() {
		
		return "dom";
	}
}
