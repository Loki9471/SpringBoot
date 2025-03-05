package com.codegnan.cruddemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.cruddemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
