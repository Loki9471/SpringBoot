package com.codegnan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
private int eno;
	@Value("Lokesh")
private String name;
	@Value("500000")
private double esalary;
	@Value("Hyderabad")
private String eaddress;
	
private Department department;
//public Employee() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//@Autowired
//public Employee(Department department) {
//	this.department=department;
//}
//
//public Employee(int eno, String name, double esalary, String eaddress, Department department) {
//	super();
//	this.eno = eno;
//	this.name = name;
//	this.esalary = esalary;
//	this.eaddress = eaddress;
//	this.department = department;
//}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + ", esalary=" + esalary + ", eaddress=" + eaddress
			+ ", department=" + department + "]";
}
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getEsalary() {
	return esalary;
}
public void setEsalary(double esalary) {
	this.esalary = esalary;
}
public String getEaddress() {
	return eaddress;
}

public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
public Department getDepartment() {
	return department;
}
@Autowired
public void setDepartment(Department department) {
	this.department = department;
}

}
