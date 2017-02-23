package com.eReporting.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.eReporting.model.Scrolling;
import com.eReporting.model.ScrollingChapter;

@Repository
public class ScrollingChapterRepository {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Create
	 */
	public ScrollingChapter create(ScrollingChapter s) {
		entityManager.persist(s);
		entityManager.flush();
		return s;
	}

	/**
	 * Update
	 */
	public ScrollingChapter update(ScrollingChapter s) {
		s = entityManager.merge(s);
		entityManager.flush();
		return s;
	}

	/**
	 * Delete
	 */
	public void delete(ScrollingChapter s) {
		entityManager.remove(s);
		entityManager.flush();
	}

	/**
	 * Find
	 */
	public ScrollingChapter find(Long id) {
		return entityManager.find(ScrollingChapter.class, id);
	}
}
