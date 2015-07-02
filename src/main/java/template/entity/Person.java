package template.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Madalin.Colezea on 7/2/2015.
 * Entitata ce se mapeaza pe tabele PERSON din baza de data
 * si are campurile fitst_name, last_name, number_of_cars, date_of_birth
 */
@Entity
@Table(name = "PERSON")
public class Person implements BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FIRST_NAME", length = 30, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 30, nullable = false)
    private String lastName;

    @Column(name = "NUMBER_OF_CARS", nullable = false)
    private Integer numberOfCars;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String firstName, String lastName, Integer numberOfCars, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfCars = numberOfCars;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
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
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!id.equals(person.id)) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!lastName.equals(person.lastName)) return false;
        if (!numberOfCars.equals(person.numberOfCars)) return false;
        return !(dateOfBirth != null ? !dateOfBirth.equals(person.dateOfBirth) : person.dateOfBirth != null);

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
