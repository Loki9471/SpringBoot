package com.codegnan.service;

import java.util.List;

import com.codegnan.entity.Employee;


public interface EmployeeService {
public List<Employee> getAllEmployees();
public Employee getEmployeeById(Long id) ;
public Employee saveEmployee(Employee employee);
public void deleteEmployee(Long id) ;
}
