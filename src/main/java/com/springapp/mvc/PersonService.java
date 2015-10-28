package com.springapp.mvc;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Camunda on 10/26/2015.
 */
@Service
public class PersonService {

    private List<Person> persons = new ArrayList<Person>();

    public PersonService(){

        persons.add(new Person("Asa", 20));
        persons.add(new Person("Oso", 33));
        persons.add(new Person("Ese", 80));
    }

    public List<Person> fetchAllPersons()
    {
        return persons;
    }
}
