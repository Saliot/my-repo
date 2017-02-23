package com.eReporting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eReporting.model.MenuItem;
import com.eReporting.repository.MenuItemJpaRepository;

@RestController
@RequestMapping ("config/")
public class MenuItemController {

		
		@Autowired
		private MenuItemJpaRepository menuitemRepository;
	
		@RequestMapping(value="menuitems", method=RequestMethod.GET, produces={"application/json"})
		public List<MenuItem> list(){
			
			return menuitemRepository.findAll();
			
		}
	
		@RequestMapping(value="menuitemslevel1", method=RequestMethod.GET, produces={"application/json"})
		public List<MenuItem> listlevel1(){
			
			return menuitemRepository.findAllTopLevel();
			
		}
}
