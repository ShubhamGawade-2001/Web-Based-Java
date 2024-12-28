package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Alien;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void mData(Model m) {
		m.addAttribute("wname","HUMONS");
	}
	

	@RequestMapping("/home")
	public String home() {
		System.out.println("Home called");
		return "index";
	}

	@RequestMapping("add")
	public String add(@RequestParam("num1") int no1, @RequestParam("num2") int no2, Model m) {

		int res = no1 + no2;

		m.addAttribute("res", res);

		return "result";
	}

//	@RequestMapping("addAlien")
//	public String addAlien(@RequestParam("aid") int aid,@RequestParam("aname")String aname,Model m) 
//	{
//		Alien aobj = new Alien();
//		aobj.setAid(aid);
//		aobj.setAname(aname);
//		
//		m.addAttribute("alien",aobj);
//		
//		return "result";
//	}

//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute Alien aobj, Model m) {
//
//		m.addAttribute("alien", aobj);
//
//		return "result";
//	}
	
//	@RequestMapping("addAlien")
//	public String addAlien( Alien obj)
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("alien") Alien obj)
	{
		return "result";
	}
	
	

}
