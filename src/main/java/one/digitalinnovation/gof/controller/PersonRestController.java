package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.builder.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

    @GetMapping("/person")
    public Person getPerson() {
        // Criando um objeto Person usando o padrão Builder
        Person person = new Person.Builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .phone("1234567890")
                .address("1234 Street Name")
                .build();

        return person;
    }
}
