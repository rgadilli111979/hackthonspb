
package com.mindtree.prediction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "policy")
public class PolicyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "systemId")
	private Integer systemId;

	@Column(name = "areaType")
	private String areaType;

	@Column(name = "channelId")
	private String channelId;


	@Column(name = "policyEffectiveDate")
	private String policyEffectiveDate;

	@Column(name = "policyExpirationDate")
	private String policyExpirationDate;

	@Column(name = "policyNumber")
	private String policyNumber;

	@Column(name = "predictedResult")
	private String predictedResult;

	@Column(name = "premiumAmount")
	private Integer premiumAmount;

	@Column(name = "result")
	private String result;

	@Column(name = "uWScore")
	private Integer uWScore;
	
	@Column(name = "customerId")
	private Integer customerId;

	public String getAreaType() {
		return areaType;
	}

	public String getChannelId() {
		return channelId;
	}


	public String getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}

	public String getPolicyExpirationDate() {
		return policyExpirationDate;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public String getPredictedResult() {
		return predictedResult;
	}

	public Integer getPremiumAmount() {
		return premiumAmount;
	}

	public String getResult() {
		return result;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public Integer getuWScore() {
		return uWScore;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}


	public void setPolicyEffectiveDate(String policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}

	public void setPolicyExpirationDate(String policyExpirationDate) {
		this.policyExpirationDate = policyExpirationDate;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public void setPredictedResult(String predictedResult) {
		this.predictedResult = predictedResult;
	}

	public void setPremiumAmount(Integer premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public void setuWScore(Integer uWScore) {
		this.uWScore = uWScore;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	

}
