package com.codegnan.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.cruddemo.entity.Employee;
import com.codegnan.cruddemo.exception.InvalidEmployeeIdException;
import com.codegnan.cruddemo.repo.EmployeeRepository;
@Service
public abstract class EmployeeServiceImpl implements EmployeeService{
private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}

	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(theEmployee);
	}

	@Override
	public Employee findById(int theId) throws InvalidEmployeeIdException {
		Optional<Employee> result=employeeRepository.findById(theId);
		if(result.isPresent()) {
			throw new InvalidEmployeeIdException("Employee id not found : "+theId);
		}else {
			return result.get();
		}
	}

	@Override
	public List<Employee> fingAll() {
		
		return employeeRepository.findAll();
	}

	public void deleteById(int theId) throws InvalidEmployeeIdException {
		Optional<Employee> optEmployee=employeeRepository.findById(theId);
		if(!optEmployee.isPresent()) {
			throw new InvalidEmployeeIdException("Employee id not found : "+theId);
		}
		employeeRepository.deleteById(theId);
		
	}

}
