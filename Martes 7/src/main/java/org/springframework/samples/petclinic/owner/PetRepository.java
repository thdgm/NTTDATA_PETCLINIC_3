package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

//@Repository

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 *
 */

public interface PetRepository extends Repository<Pet, Integer> {

	/*
	 * Get Pets born in 2010 sorted by birth date
	 */
	Collection<Pet> findByBirthDateBetweenOrderByBirthDateAsc(LocalDate i, LocalDate e) throws DataAccessException;

	/*
	 * Get Pets by Id
	 */
	Pet findById(Integer id) throws DataAccessException;

	/*
	 * Save pet
	 */
	void save(Pet p);

}
