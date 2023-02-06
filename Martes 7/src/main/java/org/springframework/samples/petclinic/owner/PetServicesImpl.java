package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 *
 */

@Service
public class PetServicesImpl implements PetServices {

	@Autowired
	private PetRepository pr;

	/*
	 * Get Pets born in 2010 sorted by birth date
	 */
	public Collection<Pet> getBornOrderByBirth(LocalDate i, LocalDate e) throws DataAccessException {

		return pr.findByBirthDateBetweenOrderByBirthDateAsc(i, e);
	}

	/*
	 * Get Pets by Id
	 */
	public Pet getPetById(Integer id) throws DataAccessException {
		return pr.findById(id);
	}

	/*
	 * Save Pet
	 */
	public void save(Pet p) throws DataAccessException {
		pr.save(p);
	}

}
