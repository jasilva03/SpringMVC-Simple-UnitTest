package com.example.testcasenotdoable;

import com.example.testcasenotdoable.controllers.PersonController;
import com.example.testcasenotdoable.model.Person;
import com.example.testcasenotdoable.services.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PersonControllerTest {

    PersonController personController;

    @Mock
    PersonService personService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.initMocks(this);
        personController = new PersonController(personService);

    }

    @Test
    void getAll() {

        //mocked response
        List<Person> mockedListPerson = Arrays.asList(new Person());
        when(personService.getAll()).thenReturn(mockedListPerson);

        List<Person> personList = personController.getAll();

        assertEquals(personList.size(), 1);
        verify(personService, times(1)).getAll();

    }

}