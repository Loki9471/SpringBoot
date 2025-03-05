package com.codegnan.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/home")
public String home() {
	return "home";
	
}
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
		}
	@RequestMapping("/hai/{name}/{tech}")
	public ModelAndView hi(@PathVariable String name,@PathVariable String tech) {
		ModelAndView modelAndView=new ModelAndView("hai");
		
		modelAndView.addObject("msg","Hello "+name+" <br> Hope your are  enjoy "+tech);
		return modelAndView;
	}
}
