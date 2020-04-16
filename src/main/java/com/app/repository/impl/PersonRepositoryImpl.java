package com.app.repository.impl;

import com.app.model.Person;
import com.app.repository.PersonRepository;
import com.app.repository.qualifiers.PersonRepositoryQualifier;

import javax.annotation.PostConstruct;
import java.util.List;

@PersonRepositoryQualifier
public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public List<Person> findAll() {
        return List.of(
                Person
                        .builder()
                        .id(1L)
                        .name("ADAM")
                        .build(),
                Person
                        .builder()
                        .id(2L)
                        .name("EWA")
                        .build()
        );
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("AFTER CONSTRUCT PERSON REPOSITORY IMPL");
    }
}
