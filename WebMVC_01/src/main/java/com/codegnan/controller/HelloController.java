package com.codegnan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HelloController {
public void hemo() {
	System.out.println("Home");
}
@GetMapping("/hello")
public void hello() {
	System.out.println("Hello");
	
}
@RequestMapping("/welcome")
public void welcome() {
	System.out.println("Welcome");
}
@RequestMapping("/hai")
public void hai() {
	String name="Lokesh";
	String tech="java";
	System.out.println("Hello"+name);
	System.out.println("Hope your enjoy "+tech);
}

@RequestMapping("/wish/{name}/{tech}")
public void wish(@PathVariable("name") String name,@PathVariable("tech") String tech) {
	System.out.println("Hello" +name);
	System.out.println("Hope your enjoy "+tech);
}
}