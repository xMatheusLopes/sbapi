package br.com.lopes.matheus.sbapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lopes.matheus.sbapi.domain.Person;
import br.com.lopes.matheus.sbapi.repository.PersonRepository;

@Service
public class PersonService {
    @Autowired
    private PersonRepository _personRepository;

    public Iterable<Person> list() {
        return _personRepository.findAll();
    }

    public Person create(Person person) {
        return _personRepository.save(person);
    }
}
