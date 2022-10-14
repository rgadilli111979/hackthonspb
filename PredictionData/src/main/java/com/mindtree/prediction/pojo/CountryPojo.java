package com.mindtree.prediction.pojo;

import java.io.Serializable;

public class CountryPojo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String countryName;
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
