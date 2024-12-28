package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{	
//	@RequestMapping("/home")
//	public String home()
//	{
//		System.out.println("Home called");
//		return "index.jsp";
//	}
	
//	@RequestMapping("add")
//	public String add(HttpServletRequest request) 
//	{
//		int no1 = Integer.parseInt(request.getParameter("num1"));
//		int no2 = Integer.parseInt(request.getParameter("num2"));
//		
//		int res = no1 + no2;
//		
//		HttpSession session = request.getSession();
//		
//		session.setAttribute("res",res);
//		
//		return "result.jsp";
//	}
	
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int no1,@RequestParam("num2") int no2,HttpSession session)
//	{
//		  
//		int res = no1 +no2;
//		
//		session.setAttribute("res", res);
//		
//		return "result.jsp";
//	}
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Home called");
		return "index";
	}
	
//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int no1,@RequestParam("num2") int no2)
//	{
//		
//		ModelAndView mv = new ModelAndView("result");
//	//	mv.setViewName("result");
//		  
//		int res = no1 +no2;
//		
//		mv.addObject("res",res);
//		
//		return mv;
//	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int no1,@RequestParam("num2") int no2
			,Model m)
	{
			  
		int res = no1 +no2;
		
		m.addAttribute("res",res);
		
		return "result";
	}
	
	
	
	

}