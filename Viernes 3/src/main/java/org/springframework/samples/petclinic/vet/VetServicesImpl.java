package org.springframework.samples.petclinic.vet;

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
public class VetServicesImpl implements VetServices {
	
	@Autowired
	private VetRepository vr;
	 /*
	 * Get Vet's list filtering by LastName field
	 */
	public Collection<Vet> getVetsUsingLastName(String ln) throws DataAccessException{
		return vr.findByLastName(ln);		
	}
	
	/*
	 * Get Vet's list filtering by LastName and FirstName fields
	 */
	public Collection<Vet> getVetsUsingLastNameAndFisrtName(String ln,String fn) throws DataAccessException{
		return vr.findByLastNameAndFirstName(ln, fn);	
	}
	
	/*
	 * Get Vet's list filtering by LastName or FirstName fields
	 */
	public Collection<Vet> getVetsUsingLastNameOrFisrtName(String ln,String fn) throws DataAccessException{
		return vr.findByLastNameOrFirstName(ln, fn);
	}
}
