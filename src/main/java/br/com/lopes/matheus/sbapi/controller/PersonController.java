package br.com.lopes.matheus.sbapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lopes.matheus.sbapi.domain.Person;
import br.com.lopes.matheus.sbapi.service.PersonService;

@RestController
@RequestMapping(value="/people")
public class PersonController {

    @Autowired PersonService _personService;

    @GetMapping()
    public ResponseEntity<Iterable<Person>> listAll() {
        Iterable<Person> list = _personService.list();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping()
    public ResponseEntity<Person> create(@RequestBody Person person) {
        return ResponseEntity.ok().body(_personService.create(person));
    }
}
