package com.eReporting.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eReporting.model.User;
import com.eReporting.repository.UserJpaRepository;

@RestController
@RequestMapping ("register/")
public class RegisterController {

		
		@Autowired
		private  UserJpaRepository userRepository;
	
		@RequestMapping(value="users", method=RequestMethod.GET, produces={"application/json"})
		public List<User> list(){
			
			return userRepository.findAll();
			
		}
		
		@RequestMapping(value="user" , method=RequestMethod.POST)
		public User create (@RequestBody User u) {
			
			if (u.getUpdateDate() == null) {
				u.setUpdateDate(new java.sql.Date(Calendar.getInstance().getTime().getTime())); 
			}
			
			if (u.getCreationDate() == null) {
				u.setCreationDate(new java.sql.Date(Calendar.getInstance().getTime().getTime())); 
			}
			
			if (u.getValidUntil() == null) {
				u.setValidUntil(new java.sql.Date(Calendar.getInstance().getTime().getTime())); 
			}
			
			if (u.getLastPasswordResetDate() == null) {
				u.setLastPasswordResetDate(new java.sql.Date(Calendar.getInstance().getTime().getTime())); 
			}
			
			
			if (u.getEnabled() == null) {
				u.setEnabled("0"); 
			}
			
			
			return userRepository.saveAndFlush(u);
		
		}
		
		/*
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
			
		}*/
		
	
}
