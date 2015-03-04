package com.cinglevue.codechallenge.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.cinglevue.codechallenge.model.Student;
 
//@Repository
public class PersonService {
     
    @Autowired
    private MongoTemplate mongoTemplate;
     
    public static final String COLLECTION_NAME = "person";
     
    public void addPerson(Student person) {
        if (!mongoTemplate.collectionExists(Student.class)) {
            mongoTemplate.createCollection(Student.class);
        }       
        person.setId(UUID.randomUUID().toString());
        mongoTemplate.insert(person, COLLECTION_NAME);
    }
     
    public List<Student> listPerson() {
        return mongoTemplate.findAll(Student.class, COLLECTION_NAME);
    }
     
    public void deletePerson(Student person) {
        mongoTemplate.remove(person, COLLECTION_NAME);
    }
     
    public void updatePerson(Student person) {
        mongoTemplate.insert(person, COLLECTION_NAME);      
    }
}