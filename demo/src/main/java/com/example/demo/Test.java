package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	@Autowired
	//@Qualifier("")
	
	//Laptop laptop  = new Laptop();
	private Computer comp;
	public void code() {
	 	comp.compile();
		System.out.println("Test codesss");
	}
	
}
