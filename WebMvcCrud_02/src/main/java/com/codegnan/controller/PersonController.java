package com.codegnan.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codegnan.entity.Person;
import com.codegnan.service.PersonService;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    // View All Persons
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("person-list");
        modelAndView.addObject("persons", personService.findAllPersons());
        return modelAndView;
    }

    // Add Person Form
    @RequestMapping("/addPersonForm")
    public ModelAndView addPersonForm() {
        return new ModelAndView("add-person");
    }

    // Add Person Operation
    @PostMapping("/addPerson")
    public ModelAndView addPerson(@RequestParam("name") String name, @RequestParam("email") String email) {
        Person person = new Person();
        person.setName(name);
        person.setEmail(email);
        personService.savePerson(person);
        return new ModelAndView("redirect:/");
    }

    // Edit Person Form
    @RequestMapping("/editPersonForm")
    public ModelAndView editPersonForm(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("edit-form");
        Optional<Person> person = personService.findByIdPerson(id);
        person.ifPresent(value -> modelAndView.addObject("person", value));
        return modelAndView;
    }

    // Update Person
    @PostMapping("/updatePerson")
    public ModelAndView updatePerson(@RequestParam int id, @RequestParam("name") String name, @RequestParam("email") String email) {
        Optional<Person> existingPerson = personService.findByIdPerson(id);
        if (existingPerson.isPresent()) {
            Person person = existingPerson.get();
            person.setName(name);
            person.setEmail(email);
            personService.savePerson(person);
        }
        return new ModelAndView("redirect:/");
    }

    // Delete Person
    @RequestMapping("/deletePerson")
    public ModelAndView deletePerson(@RequestParam int id) {
        personService.deletePerson(id);
        return new ModelAndView("redirect:/");
    }
}
