package com.app.repository;

import com.app.model.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> findAll();
}
