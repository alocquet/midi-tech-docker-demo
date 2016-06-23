package fr.gfi.miditech.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.gfi.miditech.model.Person;
import fr.gfi.miditech.repo.PersonRepository;

/**
 * service REST personne
 */
@RestController
@RequestMapping("persons")
public class PersonResource {

	/**
	 * repo
	 */
	@Autowired
	private PersonRepository repo;

	/**
	 * find all
	 * 
	 * @return all persons
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Person> findAll() {
		return repo.findAll();
	}

	/**
	 * find one
	 * 
	 * @param id
	 *            person id
	 * @return person
	 */
	@RequestMapping(value = "{id:\\d+}", method = RequestMethod.GET)
	public Person findOne(final @PathVariable Long id) {
		return repo.findOne(id);
	}

	/**
	 * create a person
	 * 
	 * @param person
	 *            person to create
	 * @return person id
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Long create(final @RequestBody Person person) {
		person.setId(null);
		return repo.save(person).getId();
	}

	/**
	 * update a person
	 * 
	 * @param person
	 *            person to update
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public void update(final @RequestBody Person person) {
		repo.save(person);
	}
}
