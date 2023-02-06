package org.springframework.samples.petclinic.owner;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/*
 * TAREA 3/02/2023
 * Diego Garcia Muro
 *
 */

@Service
public class BillServicesImpl implements BillServices {

	@Autowired
	private BillRepository br;

	/*
	 * Save a new Bill
	 */
	public void save(Bill b) {
		br.save(b);
	}

	/*
	 * Get Bills by Visit Id
	 */
	public Collection<Bill> getBillsByVisitId(Integer id) throws DataAccessException{
		return br.findByVisitId(id);
	}

	/*
	 * Get Bill by id
	 */
	public Bill getById(Integer id) throws DataAccessException{
		return br.findById(id);
	}
	
	/*
	 * Get all Bills
	 */
	public Collection<Bill> getAll() throws DataAccessException{
		return br.findAll();
	}

}
