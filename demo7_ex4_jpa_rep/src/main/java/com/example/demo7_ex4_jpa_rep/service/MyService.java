package com.example.demo7_ex4_jpa_rep.service;

import com.example.demo7_ex4_jpa_rep.entities.Person;
import com.example.demo7_ex4_jpa_rep.repository.JobRepository;
import com.example.demo7_ex4_jpa_rep.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyService {
    private final JobRepository jobRepository;
    private final PersonRepository personRepository;

    @Autowired
    public MyService(JobRepository jobRepository, PersonRepository personRepository) {
        this.jobRepository = jobRepository;
        this.personRepository = personRepository;
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }
}
