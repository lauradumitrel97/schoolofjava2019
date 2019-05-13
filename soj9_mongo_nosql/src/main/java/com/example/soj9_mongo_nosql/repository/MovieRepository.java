package com.example.soj9_mongo_nosql.repository;

import com.example.soj9_mongo_nosql.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
}
