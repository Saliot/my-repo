package com.eReporting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eReporting.model.ScrollingChapter;


@Repository
public interface ScrollingChapterJpaRepository extends JpaRepository<ScrollingChapter, Long> {

}
