package com.eReporting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eReporting.model.Scrolling;
import com.eReporting.model.config.Form;
import com.eReporting.repository.config.FormJpaRepository;

@RestController
@RequestMapping ("config/")
public class FormController {

		
		@Autowired
		private FormJpaRepository formRepository;
	
		@RequestMapping(value="forms", method=RequestMethod.GET, produces={"application/json"})
		public List<Form> list(){
			
			return formRepository.findAll();
			
		}
		
		@RequestMapping(value="form" , method=RequestMethod.POST)
		public Form create (@RequestBody Form f) {
			return formRepository.saveAndFlush(f);
		
		}
		
		@RequestMapping(value="form/{id}" , method=RequestMethod.DELETE)
		public Form delete (@PathVariable Long id) {
			
			Form s = formRepository.findOne(id);
			formRepository.delete(id);
			return s;
			
		}
		
	
}
