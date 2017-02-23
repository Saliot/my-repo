package com.eReporting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eReporting.model.User;


@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {

}
