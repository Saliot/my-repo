package com.eReporting.model.reference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ER_COUNTRY")
public class Country {
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="COUNTRYKEY",unique = true, nullable = false)
	private Long countryKey;
	
	@Column (name="COUNTRYCODE",nullable = false, length=10)
	private String countryCode;
	
	@Column (name="COUNTRYDESCRIPTION",nullable = false, length=255)
	private String countryDescription;
	
	@Column (name="REGULATORYAREA",nullable = false, length=1)
	private Integer regulatoryArea;

	public Long getCountryKey() {
		return countryKey;
	}

	public void setCountryKey(Long countryKey) {
		this.countryKey = countryKey;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryDescription() {
		return countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}

	public Integer getRegulatoryArea() {
		return regulatoryArea;
	}

	public void setRegulatoryArea(Integer regulatoryArea) {
		this.regulatoryArea = regulatoryArea;
	}

	
	
}
