package br.com.lopes.matheus.sbapi.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lopes.matheus.sbapi.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    
}
