/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.owner;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TAREA 3/02/2023 Diego Garcia Muro
 *
 */

@Controller
@RequestMapping("/visits")
class VisitsController {

	@Autowired
	VisitServices vs;

	@Autowired
	PetServices pr;

	@PostMapping(path = "/saveVisit", consumes = "application/json")
	public ResponseEntity<Visit> insertNewVisit(@RequestBody Visit newVisit) {

		Visit v = new Visit();
		v.setDate(newVisit.getDate());
		v.setDescription(newVisit.getDescription());
		vs.save(v);
		Pet p = pr.getPetById(1);
		p.addVisit(newVisit);
		pr.save(p);

		return new ResponseEntity<>(newVisit, HttpStatus.CREATED);

	}

	@GetMapping({ "/petVisits/{id}" })
	public @ResponseBody Collection<Visit> showPetVisits(@PathVariable Integer id) {

		// TODO()
		// System.out.println("VISISISISISITS "+vs.getVisitsByPetId(7));
		// HE CAMBIADO EL VISIT ENTITY
		return vs.getVisitsByPetId(id);

	}

	@GetMapping({ "/fourVisits" })
	public @ResponseBody Page<Visit> showMostRectenVisits() {

		return vs.getMostFourRecentsVisits();
	}

}
