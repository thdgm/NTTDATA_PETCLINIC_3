package org.springframework.samples.petclinic.vet;

import java.util.Collection;

import org.springframework.dao.DataAccessException;

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 * 
 */

public interface VetServices {
	/*
	 * Get Vet's list filtering by LastName field
	 */
	Collection<Vet> getVetsUsingLastName(String ln) throws DataAccessException;
	
	/*
	 * Get Vet's list filtering by LastName and FirstName fields
	 */
	Collection<Vet> getVetsUsingLastNameAndFisrtName(String ln,String fn) throws DataAccessException;
	
	/*
	 * Get Vet's list filtering by LastName or FirstName fields
	 */
	Collection<Vet> getVetsUsingLastNameOrFisrtName(String ln,String fn) throws DataAccessException;
}
