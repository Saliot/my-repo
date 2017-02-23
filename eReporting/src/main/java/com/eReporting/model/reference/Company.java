package com.eReporting.model.reference;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ER_COMPANY")
public class Company {
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="COMPANYKEY",unique = true, nullable = false)
	private Long companyKey;
	
	@Column (name="COMPANYCODE",nullable = false, length=10)
	private String companyCode;
	
	@Column (name="COMPANYDESCRIPTION",nullable = false, length=255)
	private String companyDescription;
	
	@ManyToOne
	@JoinColumn(name="COUNTRYKEY",foreignKey = @ForeignKey(name = "FK_COMPANY_COUNTRY"))
	private Country country;
	
	@Column (name="ENABLED", nullable = false, length=1)
	private String enabled;
	
	@Column (name="VALIDUNTIL",nullable = true)
	private Date validUntil;

	public Long getCompanyKey() {
		return companyKey;
	}

	public void setCompanyKey(Long companyKey) {
		this.companyKey = companyKey;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyDescription() {
		return companyDescription;
	}

	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public Date getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
	
}
