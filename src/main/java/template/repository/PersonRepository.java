package template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import template.entity.Person;

import java.util.List;

/**
 * Created by Madalin.Colezea on 7/2/2015.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByFirstName(String firstName);
}
