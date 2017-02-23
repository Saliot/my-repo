package com.eReporting.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eReporting.model.User;

@Repository
public class UserRepository {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Create
	 */
	public User create(User u) {
		entityManager.persist(u);
		entityManager.flush();
		return u;
	}

	/**
	 * Update
	 */
	public User update(User u) {
		u = entityManager.merge(u);
		entityManager.flush();
		return u;
	}

	/**
	 * Delete
	 */
	public void delete(User u) {
		entityManager.remove(u);
		entityManager.flush();
	}

	/**
	 * Find
	 */
	public User find(Long id) {
		return entityManager.find(User.class, id);
	}
}
