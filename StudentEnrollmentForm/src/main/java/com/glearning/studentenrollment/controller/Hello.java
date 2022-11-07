package com.glearning.studentenrollment.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/")
public class Hello {
	
	@GetMapping("/Hello")
	public String sayHello() {
		return "main-menu";
	}
	

}
