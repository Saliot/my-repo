package com.eReporting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.eReporting.model.reference.Company;
import com.eReporting.model.reference.Country;
import com.eReporting.repository.CompanyJpaRepository;
import com.eReporting.repository.CountryJpaRepository;

@RestController
@RequestMapping ("config/")
public class ReferenceController {

		
		@Autowired
		private CompanyJpaRepository companyRepository;
		@Autowired
		private CountryJpaRepository countryRepository;
	
		@RequestMapping(value="companies", method=RequestMethod.GET, produces={"application/json"})
		public List<Company> companylist(){
			
			return companyRepository.findAll();
			
		}
		
		@RequestMapping(value="countries", method=RequestMethod.GET, produces={"application/json"})
		public List<Country> countrylist(){
			
			return countryRepository.findAll();
			
		}
	
}
