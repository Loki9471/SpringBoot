package com.codegnan.curdrest.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codegnan.cruddemo.entity.Employee;
import com.codegnan.cruddemo.exception.InvalidEmployeeIdException;
import com.codegnan.cruddemo.service.EmployeeService;

@RequestMapping("/api/employees")
 class RestController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.fingAll();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) throws InvalidEmployeeIdException {
		return employeeService.findById(id);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@RequestBody Employee employee) throws InvalidEmployeeIdException {
		return employeeService.findById(2);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) throws InvalidEmployeeIdException {
		employeeService.deletById(id);
		return "Employee deleted successfully!";
	}
}
