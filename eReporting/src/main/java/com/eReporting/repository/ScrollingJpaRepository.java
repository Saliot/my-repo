package com.eReporting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eReporting.model.Scrolling;


@Repository
public interface ScrollingJpaRepository extends JpaRepository<Scrolling, Long> {

}
