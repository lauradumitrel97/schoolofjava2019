package com.example.demo7_ex4_jpa_rep.repository;

import com.example.demo7_ex4_jpa_rep.entities.JobName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository <JobName, Integer> {
}
