package com.example.soj9_mongo_nosql.service;

import com.example.soj9_mongo_nosql.model.Cast;
import com.example.soj9_mongo_nosql.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastService {

    @Autowired
    private CastRepository castRepository;

    public Cast save(Cast cast) {
        return castRepository.save(cast);
    }
}
