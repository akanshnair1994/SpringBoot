package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("personDao")
public class PersonDataAccessService implements PersonDao {
    private List<Person> personsDB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        personsDB.add(new Person(id, person.getName()));

        return 1;
    }

    @Override
    public List<Person> selectPeople() {
        return personsDB;
    }
}
