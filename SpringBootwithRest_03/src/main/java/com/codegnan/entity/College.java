package com.codegnan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="name")
private String name;
	@Column(name="branch")
private String department;
public College(String name, String department) {
	super();
	this.name = name;
	this.department = department;
}
public College() {
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "College [id=" + id + ", name=" + name + ", department=" + department + "]";
}

}
