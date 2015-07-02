package template.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.BeanUtils;
import template.entity.Person;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Madalin.Colezea on 7/2/2015.
 */
public class PersonDTO implements Serializable {

    private Long id;

    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "numberOfCars")
    private Integer numberOfCars;

    @JsonProperty(value = "dateOfBirth")
    private Date dateOfBirth;

    public PersonDTO() {
    }

    public PersonDTO(Long id, String firstName, String lastName, Integer numberOfCars, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfCars = numberOfCars;
        this.dateOfBirth = dateOfBirth;
    }

    public PersonDTO(Person person){
        this.id = person.getId();
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.numberOfCars = person.getNumberOfCars();
        this.dateOfBirth = person.getDateOfBirth();
    }

    public Person toEntity(Person person){
        BeanUtils.copyProperties(this, person);
        return person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(Integer numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonDTO)) return false;

        PersonDTO personDTO = (PersonDTO) o;

        if (!id.equals(personDTO.id)) return false;
        if (!firstName.equals(personDTO.firstName)) return false;
        if (!lastName.equals(personDTO.lastName)) return false;
        if (!numberOfCars.equals(personDTO.numberOfCars)) return false;
        return !(dateOfBirth != null ? !dateOfBirth.equals(personDTO.dateOfBirth) : personDTO.dateOfBirth != null);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + numberOfCars.hashCode();
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;
    }
}
