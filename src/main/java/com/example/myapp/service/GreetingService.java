package com.example.myapp.service;

import com.example.myapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public String generateGreeting(String name) {
        Person person = new Person();
        person.setName(name);
        mongoTemplate.save(person);

        return "Hello, " + name + "!";
    }
}