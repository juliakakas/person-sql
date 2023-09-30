package hu.progmatic.personlistsql.service;

import hu.progmatic.personlistsql.model.Person;
import hu.progmatic.personlistsql.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }
}
