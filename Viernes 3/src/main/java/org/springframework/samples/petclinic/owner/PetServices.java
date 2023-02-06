package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.dao.DataAccessException;


/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 * 
 */

public interface PetServices {
	
	
	/*
	 * Get Pets born in 2010 sorted by birth date
	 */
	Collection<Pet> getBornOrderByBirth(LocalDate i,LocalDate e) throws DataAccessException;
	
	/*
	 * Get Pets by Id
	 */
	Pet getPetById(Integer id) throws DataAccessException;
	
	/*
	 * Save Pet 
	 */
	void save(Pet p) throws DataAccessException;
	
	
}
