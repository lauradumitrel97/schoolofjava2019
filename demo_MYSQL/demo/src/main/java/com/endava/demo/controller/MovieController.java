package com.endava.demo.controller;

import com.endava.demo.model.Movie;
import com.endava.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private RestTemplate restTemplate;
    //CRUD

    //CREATE
    //3 optiuni de parametru: RequestBody, RequestParam, PathVariable
    //@RequestMapping(value = "/", method = RequestMethod.POST)
    @PostMapping(value="/")
    public int add(@RequestParam String title, @RequestParam String genre) {
        return movieService.add(title, genre);
    }

    @PostMapping(value="/add")
    public String addMovie(@RequestBody Movie movie, HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpStatus.CREATED.value());
        return movie.getTitle();
    }

    //RETRIEVE
    //todo get by id si get all

    //UPDATE
    //todo model -> rating (din postman times_up)

    //DELETE
    @DeleteMapping(value="/{id}")
    public int delete(@PathVariable int id) {
       return movieService.delete(id);
    }

    @GetMapping(value="/")
    public void callRest() {
        String url = "http://localhost:8080/1";
         restTemplate.delete(url);
    }
}
