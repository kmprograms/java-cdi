package com.app.service;

import com.app.model.Person;
import com.app.repository.PersonRepository;
import com.app.repository.qualifiers.PersonRepositoryQualifier;
import com.app.repository.qualifiers.PersonRepositoryQualifier2;

import javax.inject.Inject;
import java.util.List;

public class PersonService {

    // @Inject
    // @PersonRepositoryImpl
    private final PersonRepository personRepository;

    /*public PersonService(@PersonRepositoryImpl2 PersonRepository personRepository) {
        this.personRepository = personRepository;
    }*/

    @Inject
    public PersonService(@PersonRepositoryQualifier PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    /*@Inject
    public void setPersonRepository(*//*@PersonRepositoryImpl*//* PersonRepository personRepository) {
        this.personRepository = personRepository;
    }*/

    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
