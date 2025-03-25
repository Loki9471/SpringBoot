package com.codegnan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="name")
private String name;
	@Column(name="email")
private String email;
public Person(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
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
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
}

}
