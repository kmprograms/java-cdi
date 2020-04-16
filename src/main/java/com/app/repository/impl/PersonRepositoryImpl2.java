package com.app.repository.impl;

import com.app.model.Person;
import com.app.repository.PersonRepository;
import com.app.repository.qualifiers.PersonRepositoryQualifier2;

import java.util.List;

@PersonRepositoryQualifier2
public class PersonRepositoryImpl2 implements PersonRepository {
    @Override
    public List<Person> findAll() {
        return List.of(
                Person
                        .builder()
                        .id(1L)
                        .name("PAWEL")
                        .build(),
                Person
                        .builder()
                        .id(2L)
                        .name("IGOR")
                        .build()
        );
    }
}

