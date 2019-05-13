package com.example.soj9_mongo_nosql.repository;

import com.example.soj9_mongo_nosql.model.Cast;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CastRepository extends MongoRepository<Cast, String> {
}
