package com.eReporting.model;

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

import com.eReporting.model.reference.Company;

@Entity
@Table(name="ER_USER")
public class User {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="USERKEY",unique = true, nullable = false)
	private Long userKey;
	
	@Column (name="LASTNAME",nullable = false, length=255)
	private String lastName;
	
	@Column (name="FIRSTNAME",nullable = false, length=255)
	private String firstName;
	
	@Column (name="EMAIL",unique = true, nullable = false, length=255)
	private String email;
	
	@ManyToOne
	@JoinColumn(name="COMPANYKEY",foreignKey = @ForeignKey(name = "FK_USER_COMPANY"))
	private Company company;
	
	@Column (name="PASSWORD",unique = true, nullable = false, length=255)
	private String password;
	
	@Column (name="ENABLED", nullable = false, length=1)
	private String enabled;
	
	@Column (name="VALIDUNTIL",nullable = true)
	private Date validUntil;
	
	@Column (name="LASTPASSWORDRESETDATE",nullable = false)
	private Date lastPasswordResetDate;
	
	@Column (name="CREATIONDATE",nullable = false)
	private Date creationDate;
	
	@Column (name="UPDATEDATE",nullable = false)
	private Date updateDate;

	public Long getUserKey() {
		return userKey;
	}

	public void setUserKey(Long userKey) {
		this.userKey = userKey;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}

	public void setLastPasswordResetDate(Date lastPasswordResetDate) {
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {

			this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
			this.updateDate = updateDate;	
	}
	
	
}
