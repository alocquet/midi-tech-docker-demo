package fr.gfi.miditech.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.gfi.miditech.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}