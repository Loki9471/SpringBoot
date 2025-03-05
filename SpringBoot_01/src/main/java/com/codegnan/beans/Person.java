package com.codegnan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Person {
	
	@Value("101")
  private int id;
	@Value("Lokesh")
  private String name;
	@Value("Lokesh@gmail.com")
  private String email;
public Person(int id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
}
  
}
