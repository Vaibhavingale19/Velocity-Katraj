package com.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.model.UserDetails;
import com.management.service.UserService;

@Controller
public class home_controller {
	
//	@Autowired 
	private UserService userService;
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDetails user)
	{
		System.out.println(user);
		
//		UserDetails userDetails = userService.createUser(user);
//		if(userDetails!=null)
//		{
//			System.out.println("Register Successfully");
//		}
//		else
//		{
//			System.out.println("Register Failed");
//		}
		return "redirect:/register";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	
}
