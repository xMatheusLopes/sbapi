package br.com.lopes.matheus.sbapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lopes.matheus.sbapi.domain.Person;

@RestController
@RequestMapping(value="/people")
public class PersonController {
    @GetMapping()
    public ResponseEntity<List<Person>> listAll() {
        List<Person> list = new ArrayList<Person>();
        Person person = new Person();
        person.setId(1);
        person.setName("Matheus");
        list.add(person);
        return ResponseEntity.ok().body(list);
    }
}
