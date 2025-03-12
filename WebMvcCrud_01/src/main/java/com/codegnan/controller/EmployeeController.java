package com.codegnan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codegnan.entity.Employee;
import com.codegnan.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// View All Employees
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("employee-list");
		modelAndView.addObject("employees", employeeService.getAllEmployees());
		return modelAndView;
	}

	// Add Employee Form
	@RequestMapping("/addEmployeeForm")
	public ModelAndView addEmployeeForm() {
		return new ModelAndView("add-employee-form");
	}

	// Add Employee Operation
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@RequestParam("name") String name, @RequestParam("salary") Double salary,
			@RequestParam("designation") String designation) {
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		employeeService.saveEmployee(employee);
		return new ModelAndView("redirect:/");
	}

	// Edit Employee Form
	@RequestMapping("/editEmployeeForm")
	public ModelAndView editEmployeeForm(@RequestParam Long id) {
		ModelAndView modelAndView = new ModelAndView("edit-form");
		Employee employee = employeeService.getEmployeeById(id);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
	


	// Delete Employee
	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@RequestParam("id") Long id) {
		employeeService.deleteEmployee(id);
		return new ModelAndView("redirect:/");
	}
}
