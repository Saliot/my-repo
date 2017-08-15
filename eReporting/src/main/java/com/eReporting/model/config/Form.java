package com.eReporting.model.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ER_FORM")
public class Form {

	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="FORMKEY",unique = true, nullable = false)
	private Long formKey;
	
	@Column (name="FORMCODE",nullable = false, length=10)
	private String formCode;
	
	@Column (name="FORMDESCRIPTION",nullable = false, length=255)
	private String formDescription;
	
	@Column (name="FORMDESCRIPTION_FR",nullable = false, length=255)
	private String formDescription_fr;

	public Long getFormKey() {
		return formKey;
	}

	public void setFormKey(Long formKey) {
		this.formKey = formKey;
	}

	public String getFormCode() {
		return formCode;
	}

	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}

	public String getFormDescription() {
		return formDescription;
	}

	public void setFormDescription(String formDescription) {
		this.formDescription = formDescription;
	}

	public String getFormDescription_fr() {
		return formDescription_fr;
	}

	public void setFormDescription_fr(String formDescription_fr) {
		this.formDescription_fr = formDescription_fr;
	}
	
	
}
