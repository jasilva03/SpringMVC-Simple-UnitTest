package com.example.testcasenotdoable.services;

import com.example.testcasenotdoable.model.Person;
import com.example.testcasenotdoable.services.PersonService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> getAll() {

        Person p1 = new Person("p1","p1");
        Person p2 = new Person("p2","p2");

        return Arrays.asList(p1, p2);

    }

}
