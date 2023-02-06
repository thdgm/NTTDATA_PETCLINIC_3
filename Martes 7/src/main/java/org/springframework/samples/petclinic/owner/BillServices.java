package org.springframework.samples.petclinic.owner;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 *
 */

public interface BillServices {

	/*
	 * Save a new Bill
	 */
	void save(Bill b);

	/*
	 * Get Bills by Visit Id
	 */
	public Collection<Bill> getBillsByVisitId(Integer id) throws DataAccessException;

	/*
	 * Get Bill by id
	 */
	Bill getById(Integer id) throws DataAccessException;
	
	/*
	 * Get all Bills
	 */
	Collection<Bill> getAll() throws DataAccessException;

}
