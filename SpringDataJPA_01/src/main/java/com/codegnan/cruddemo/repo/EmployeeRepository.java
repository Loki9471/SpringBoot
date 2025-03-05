package com.codegnan.cruddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
