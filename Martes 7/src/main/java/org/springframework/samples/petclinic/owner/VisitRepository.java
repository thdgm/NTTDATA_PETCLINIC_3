package org.springframework.samples.petclinic.owner;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 *
 */

public interface VisitRepository extends Repository<Visit, Integer> {

	/*
	 * Save a new Visit
	 */
	void save(Visit v);

	/*
	 * Get Visits by Pet Id
	 */
	Collection<Visit> findByPetId(Integer id) throws DataAccessException;

	/*
	 * Get first 4 most recent Visits
	 */
	Page<Visit> findAllByOrderByDateDesc(Pageable pageable) throws DataAccessException;

	/*
	 * Get visit by id
	 */
	Visit findById(Integer id) throws DataAccessException;
	
	/*
	 * Get Visits by Bill Id
	 */
	Collection<Visit> findByBillsId(Integer id) throws DataAccessException;

	

}
