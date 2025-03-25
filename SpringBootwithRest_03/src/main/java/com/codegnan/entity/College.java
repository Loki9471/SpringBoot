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
private String branch;
	@Column(name="branch")
private String department;
public College(String branch, String department) {
	super();
	this.branch = branch;
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
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "College [id=" + id + ", branch=" + branch + ", department=" + department + "]";
}

}
