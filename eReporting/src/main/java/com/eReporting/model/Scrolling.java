package com.eReporting.model;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SCROLLING")
public class Scrolling {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="SCROLLINGKEY",unique = true, nullable = false)
	private Long scrollingKey;
	
	@Column (name="SCROLLINGCODE",unique = true, nullable = false, length=10)
	private String scrollingCode;
	
	@Column (name="SCROLLINGDESCRIPTION",nullable = false,length=255)
	private String scrollingDescription;
	
	@Column (name="CREATIONDATE",nullable = false)
	private Date creationDate;
	
	@Column (name="UPDATEDATE",nullable = false)
	private Date updateDate;

	@Column (name="USERKEY",nullable = false)
	private int userKey;

	@OneToMany (mappedBy="scrolling",cascade=CascadeType.ALL)
	private List<ScrollingChapter> scrollingchapters = new ArrayList<ScrollingChapter>();
	
	
	public Date getCreationDate() {
		return creationDate;
	}

	public List<ScrollingChapter> getScrollingchapters() {
		return scrollingchapters;
	}

	public String getScrollingCode() {
		return scrollingCode;
	}

	public String getScrollingDescription() {
		return scrollingDescription;
	}

	public Long getScrollingKey() {
		return scrollingKey;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public int getUserKey() {
		return userKey;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setScrollingchapters(List<ScrollingChapter> scrollingchapters) {
		this.scrollingchapters = scrollingchapters;
	}

	public void setScrollingCode(String scrollingCode) {
		this.scrollingCode = scrollingCode;
	}

	public void setScrollingDescription(String scrollingDescription) {
		this.scrollingDescription = scrollingDescription;
	}

	public void setScrollingKey(Long scrollingKey) {
		this.scrollingKey = scrollingKey;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUserKey(int userKey) {
		this.userKey = userKey;
	}
		
		
}
