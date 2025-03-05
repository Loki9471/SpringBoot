package com.codegnan.cruddemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
private int id;
	@Column(name = "first_name")
private String FirstName;
	@Column(name = "last_name")
private String LastName;
	@Column(name = "email")
private String Email;
	
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String firstName, String lastName, String email) {
	super();
	this.id = id;
	FirstName = firstName;
	LastName = lastName;
	Email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + "]";
}



}
