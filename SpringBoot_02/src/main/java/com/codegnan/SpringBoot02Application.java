package com.codegnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codegnan.beans.Employee;

@SpringBootApplication
public class SpringBoot02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac=SpringApplication.run(SpringBoot02Application.class, args);
	
	Employee employee=cac.getBean(Employee.class);
	  System.out.println(employee);
	}

}
