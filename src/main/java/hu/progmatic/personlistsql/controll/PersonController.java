package hu.progmatic.personlistsql.controll;

import hu.progmatic.personlistsql.model.Person;
import hu.progmatic.personlistsql.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
}
