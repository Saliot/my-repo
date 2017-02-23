package com.eReporting.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eReporting.model.Scrolling;;

@Repository
public class ScrollingRepository {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Create
	 */
	public Scrolling create(Scrolling s) {
		entityManager.persist(s);
		entityManager.flush();
		return s;
	}

	/**
	 * Update
	 */
	public Scrolling update(Scrolling s) {
		s = entityManager.merge(s);
		entityManager.flush();
		return s;
	}

	/**
	 * Delete
	 */
	public void delete(Scrolling s) {
		entityManager.remove(s);
		entityManager.flush();
	}

	/**
	 * Find
	 */
	public Scrolling find(Long id) {
		return entityManager.find(Scrolling.class, id);
	}
}
