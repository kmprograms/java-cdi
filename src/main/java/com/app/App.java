package com.app;

import com.app.repository.PersonRepository;
import com.app.repository.impl.PersonRepositoryImpl;
import com.app.service.PersonService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App
{
    public static void main( String[] args )
    {
        // BEZ CDI
        /*
        var personRepository = new PersonRepositoryImpl();
        var personService = new PersonService(personRepository);
        System.out.println(personService.getAll());
        */

        // Z WYKORZYSTANIEM CDI
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();

        PersonService personService = weldContainer.select(PersonService.class).get();
        personService
                .getAll()
                .forEach(System.out::println);
    }
}
