package com.mindtree.prediction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurer_name")
public class InsurerName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "countryCode")
	private String countryCode;

	@Column(name = "insuranceCompnay")
	private String insuranceCompnay;

	@Id
	@Column(name = "insurerCode")
	private String insurerCode;

	public String getCountryCode() {
		return countryCode;
	}

	public String getInsuranceCompnay() {
		return insuranceCompnay;
	}

	public String getInsurerCode() {
		return insurerCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setInsuranceCompnay(String insuranceCompnay) {
		this.insuranceCompnay = insuranceCompnay;
	}

	public void setInsurerCode(String insurerCode) {
		this.insurerCode = insurerCode;
	}

}
