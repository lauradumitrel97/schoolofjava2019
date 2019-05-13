package com.example.soj9_mongo_nosql.controller;

import com.example.soj9_mongo_nosql.model.Movie;
import com.example.soj9_mongo_nosql.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/")
    public Movie add(@RequestBody Movie movie) {
        return movieService.add(movie);
    }

    @GetMapping("/")
    public List<Movie> findall() {
        return movieService.findall();
    }
}
