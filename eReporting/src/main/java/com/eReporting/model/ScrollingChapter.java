package com.eReporting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ER_SCROLLINGCHAPTER")
public class ScrollingChapter {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="SCROLLINGCHAPTERKEY",unique = true, nullable = false)
	private int scrollingChapterKey;
	
	@Column (name="CHAPTERINFERIOR",nullable = false,length=10)
	private String chapterInferior;

	@Column (name="CHAPTERSUPERIOR",nullable = false,length=10)
	private String chapterSuperior;
	
	@Column (name="OPERATOR",nullable = false,length=1)
	private String operator;
	
	@ManyToOne
	@JoinColumn(name="SCROLLINGKEY" ,foreignKey = @ForeignKey(name = "FK_SCROLLING"))
	private Scrolling scrolling;
	

	public int getScrollingChapterKey() {
		return scrollingChapterKey;
	}

	public void setScrollingChapterKey(int scrollingChapterKey) {
		this.scrollingChapterKey = scrollingChapterKey;
	}

	public String getChapterInferior() {
		return chapterInferior;
	}

	public void setChapterInferior(String chapterInferior) {
		this.chapterInferior = chapterInferior;
	}

	public String getChapterSuperior() {
		return chapterSuperior;
	}

	public void setChapterSuperior(String chapterSuperior) {
		this.chapterSuperior = chapterSuperior;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
/*
	public Scrolling getScrolling() {
		return scrolling;
	}

	public void setScrolling(Scrolling scrolling) {
		this.scrolling = scrolling;
	}*/
}
