package template.service;

import template.dto.PersonDTO;
import template.entity.Person;

/**
 * Created by Madalin.Colezea on 7/2/2015.
 */
public interface PersonService {
    public Person getPersonByFirstName(String firstName);

    public Person addPerson(PersonDTO personDTO);
}
