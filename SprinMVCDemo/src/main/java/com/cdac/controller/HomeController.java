package com.cdac.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.model.Alien;

@Controller
public class HomeController  {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("This is home");
		return "index";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(@ModelAttribute("alien") Alien aobj)
	{
		return "result";
	}
  	
}