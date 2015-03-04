package com.cinglevue.codechallenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cinglevue.codechallenge.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
