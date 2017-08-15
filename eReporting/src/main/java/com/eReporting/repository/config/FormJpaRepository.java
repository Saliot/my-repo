package com.eReporting.repository.config;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eReporting.model.config.Form;

@Repository
public interface FormJpaRepository extends JpaRepository<Form, Long> {
	
}
