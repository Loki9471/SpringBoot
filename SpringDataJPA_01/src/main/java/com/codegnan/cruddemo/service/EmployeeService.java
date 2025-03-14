package com.codegnan.cruddemo.service;

import java.util.List;

import com.codegnan.cruddemo.entity.Employee;
import com.codegnan.cruddemo.exception.InvalidEmployeeIdException;

public interface EmployeeService {
  public Employee save(Employee theEmployee);
  
  public Employee findById(int theId)throws InvalidEmployeeIdException;
  
  public List<Employee> fingAll();
  
  public void deletById(int theId)throws InvalidEmployeeIdException;


  
}
