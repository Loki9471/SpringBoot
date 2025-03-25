package com.codegnan.service;

import java.util.List;
import java.util.Optional;
import com.codegnan.entity.Person;

public interface PersonService {
    List<Person> findAllPersons();
    Optional<Person> findByIdPerson(int id);
    Person savePerson(Person person);
    void deletePerson(int id);
}
