package com.apsdn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApsdnController {
	@RequestMapping("login")
	public ModelAndView welcome(){
		String message = "HELLO SPRING MVC HOW R U";
		return new ModelAndView("login", "message", message);
	}
}
