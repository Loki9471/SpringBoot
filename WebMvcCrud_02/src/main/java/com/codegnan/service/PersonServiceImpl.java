package com.codegnan.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codegnan.entity.Person;
import com.codegnan.repo.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }

    @Override
    public Optional<Person> findByIdPerson(int id) {
        return personRepository.findById(id);
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}
