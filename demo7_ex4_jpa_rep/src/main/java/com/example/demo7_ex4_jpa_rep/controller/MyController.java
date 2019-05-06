package com.example.demo7_ex4_jpa_rep.controller;

import com.example.demo7_ex4_jpa_rep.entities.Person;
import com.example.demo7_ex4_jpa_rep.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping(path = "/getPeople")
    public List<Person> getPeople() {
        return myService.getPeople();
    }
}
