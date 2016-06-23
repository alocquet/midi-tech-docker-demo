package fr.gfi.miditech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * Person
 */
@Entity
@Data
public class Person {
	/**
	 * id
	 */
	@Id
	@GeneratedValue
	private Long id;
	
	/**
	 * name
	 */
	private String name;
}