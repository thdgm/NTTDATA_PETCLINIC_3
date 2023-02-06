package org.springframework.samples.petclinic.owner;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 *
 */

public interface VisitServices {

	/*
	 * Save a new Visit
	 */
	void save(Visit v);

	/*
	 * Get Visits by Pet Id
	 */
	public Collection<Visit> getVisitsByPetId(Integer id) throws DataAccessException;

	/*
	 * Get first 4 most recent Visits
	 */
	Page<Visit> getMostFourRecentsVisits() throws DataAccessException;

	/*
	 * Get visit by id
	 */
	Visit getById(Integer id) throws DataAccessException;
	
	/*
	 * Get Visits by Bill Id
	 */
	Collection<Visit> getBillsByVisitId(Integer id) throws DataAccessException;
}
