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
public class VisitServicesImpl implements VisitServices {

	@Autowired
	private VisitRepository vr;
	
	 /*
	 * Save a new Visit
	 */
	public void save(Visit v) {
		vr.save(v);
	}
	
	/*
	 * Get Visits by Pet Id
	 */
	public Collection<Visit> getVisitsByPetId(Integer id) throws DataAccessException{
		return vr.findByPetId(id);
	}
	
	/*
	 * Get first 4 most recent Visits
	 */
	public Page<Visit> getMostFourRecentsVisits() throws DataAccessException{
		
		Page<Visit> page = vr.findAllByOrderByDateDesc( PageRequest.of(0, 3));
		System.out.println("PAGES: "+page);
		return page;//vr.findAllByOrderByDateDesc();
	}
	
	/*
	 * Get visit by id
	 */
	public Visit getById(Integer id) throws DataAccessException{
		return vr.findById(id);
	}
}
