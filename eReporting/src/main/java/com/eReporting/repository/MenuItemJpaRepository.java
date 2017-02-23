package com.eReporting.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eReporting.model.MenuItem;

@Repository
public interface MenuItemJpaRepository extends JpaRepository<MenuItem, Long> {
	
	@Query("select m from MenuItem m where menuitemparentkey is null")
	List< MenuItem> findAllTopLevel();

}
