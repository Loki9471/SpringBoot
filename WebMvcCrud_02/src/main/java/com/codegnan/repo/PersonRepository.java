package com.codegnan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codegnan.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
