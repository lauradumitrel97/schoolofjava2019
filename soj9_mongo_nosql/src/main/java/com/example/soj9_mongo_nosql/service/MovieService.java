package com.example.soj9_mongo_nosql.service;

import com.example.soj9_mongo_nosql.model.Cast;
import com.example.soj9_mongo_nosql.model.Movie;
import com.example.soj9_mongo_nosql.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    public CastService castService;

    public Movie add(Movie movie) {
       Cast cast = castService.save(movie.getCast());
       movie.setCast(cast);
       return movieRepository.save(movie);
    }

    public List<Movie> findall() {
        return movieRepository.findAll();
    }
}
