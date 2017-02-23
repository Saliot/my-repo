package com.eReporting.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eReporting.model.reference.Company;


@Repository
public interface CompanyJpaRepository extends JpaRepository<Company, Long> {
	
	@Query("select c from Company c order by c.companyDescription")
	List< Company> findAll();

}
