package com.ali.service;

import com.ali.config.RuleConf;
import com.ali.model.Person;
import com.ali.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found, id: " + id));
    }


    public void save(Person rule) {
        personRepository.save(rule);
    }


    public void personCanHaveInsurance(Person person) {
        System.out.println("person can have insurance " + person);
    }



}
