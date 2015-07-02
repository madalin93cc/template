package template.rest;

import org.springframework.web.bind.annotation.*;
import template.dto.PersonDTO;
import template.entity.Person;
import template.service.PersonService;
import template.utils.RequestMappings;

import javax.inject.Inject;

/**
 * Created by Madalin.Colezea on 7/2/2015.
 */
@RestController
public class PersonResource {

    @Inject
    PersonService personService;

    @RequestMapping(value = RequestMappings.GET_USER_BY_FIRST_NAME, method = RequestMethod.GET, produces = "application/json")
    public Person getPersonByFirstName(@PathVariable("firstName") String firstName){
        return personService.getPersonByFirstName(firstName);
    }

    @RequestMapping(value = RequestMappings.ADD_PERSON, method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public Person addPerson(@RequestBody PersonDTO personDTO){
        return personService.addPerson(personDTO);
    }
}
