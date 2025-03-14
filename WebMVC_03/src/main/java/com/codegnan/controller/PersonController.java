package com.codegnan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.codegnan.model.Person;

@Controller
public class PersonController {
	
  @RequestMapping("/newperson")
public ModelAndView personform() {
	  ModelAndView  modelAndView =new ModelAndView("personform"); 
	  modelAndView.addObject("person",new Person());
	  return modelAndView;
	}
  @RequestMapping("/regperson")
	public ModelAndView personRegistration(@ModelAttribute Person person) {
		
		ModelAndView modelAndView=new ModelAndView("newperson");
		modelAndView.addObject("person",person);
		return modelAndView;
	}
}
