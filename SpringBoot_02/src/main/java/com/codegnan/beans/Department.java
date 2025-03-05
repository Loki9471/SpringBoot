package com.codegnan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	@Value("d-111")
private String did;
	@Value("Tech")
private String deptName;
	@Value("m-1")
private String deptBlock;
//public Department() {
//	super();
//	// TODO Auto-generated constructor stub
//}
//public Department(String did, String deptName, String deptBlock) {
//	super();
//	this.did = did;
//	this.deptName = deptName;
//	this.deptBlock = deptBlock;
//}
@Override
public String toString() {
	return "Department [did=" + did + ", deptName=" + deptName + ", deptBlock=" + deptBlock + "]";
}
public String getDid() {
	return did;
}
public void setDid(String did) {
	this.did = did;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getDeptBlock() {
	return deptBlock;
}
public void setDeptBlock(String deptBlock) {
	this.deptBlock = deptBlock;
}
}
