package com.mindtree.prediction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class CountryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "countryName")
	private String countryName;

	@Column(name = "unCode")
	private String unCode;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getUnCode() {
		return unCode;
	}

	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}

	
	

}
