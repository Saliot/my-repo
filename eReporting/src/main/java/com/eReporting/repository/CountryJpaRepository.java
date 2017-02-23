package com.eReporting.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eReporting.model.reference.Country;


@Repository
public interface CountryJpaRepository extends JpaRepository<Country, Long> {
	
	@Query("select c from Country c order by c.countryDescription")
	List< Country> findAll();

}
