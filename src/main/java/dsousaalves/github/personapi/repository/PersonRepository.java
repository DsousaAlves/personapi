package dsousaalves.github.personapi.repository;

import dsousaalves.github.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
