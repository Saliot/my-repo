package com.eReporting.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eReporting.model.Scrolling;
import com.eReporting.repository.ScrollingJpaRepository;

@RestController
@RequestMapping ("config/")
public class ScrollingController {

		
		@Autowired
		private ScrollingJpaRepository scrollingRepository;
	
		@RequestMapping(value="scrollings", method=RequestMethod.GET, produces={"application/json"})
		public List<Scrolling> list(){
			
			return scrollingRepository.findAll();
			
		}
		
		@RequestMapping(value="scrolling" , method=RequestMethod.POST)
		public Scrolling create (@RequestBody Scrolling s) {
			return scrollingRepository.saveAndFlush(s);
		
		}
		
		@RequestMapping(value="scrolling/{id}" , method=RequestMethod.GET)
		public Scrolling get(@PathVariable Long id) {
			
			return scrollingRepository.findOne(id);
			
		}
		
		@RequestMapping(value="scrolling/{id}" , method=RequestMethod.PUT)
		public Scrolling update (@PathVariable Long id, @RequestBody Scrolling s) {
			
			Scrolling existingScrolling = scrollingRepository.findOne(id);
			BeanUtils.copyProperties(s, existingScrolling);
			
			return scrollingRepository.saveAndFlush(existingScrolling);
			
		}
		
		
		@RequestMapping(value="scrolling/{id}" , method=RequestMethod.DELETE)
		public Scrolling delete (@PathVariable Long id) {
			
			Scrolling s = scrollingRepository.findOne(id);
			scrollingRepository.delete(id);
			return s;
			
		}
		
	
}
