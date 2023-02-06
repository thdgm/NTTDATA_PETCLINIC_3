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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


/**
 *Diego Garcia Muro
 *Tarea para martes 6
 */

@Controller
class BillController {

	@Autowired
	BillServices br;
	
	@Autowired
	VisitServices vs;
	
	@GetMapping("/bills/{billId}")
	public ModelAndView showBill(@PathVariable("billId") int billId) {
		ModelAndView mav = new ModelAndView("owners/billDetails");
		Bill bill = br.getById(billId);
		Collection<Visit> visits = vs.getBillsByVisitId(bill.getId());
		mav.addObject(bill);
		mav.addObject("v",visits);
		return mav;
	}

}
