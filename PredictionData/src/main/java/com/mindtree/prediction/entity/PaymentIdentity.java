
package com.mindtree.prediction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PaymentIdentity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "customerId")
	private Integer customerId;

	@Column(name = "paymentDate")
	private String paymentDate;

	@Column(name = "systemId")
	private Integer systemId;

	PaymentIdentity() {

	}

	public PaymentIdentity(Integer customerId, String paymentDate, Integer systemId) {
		super();
		this.customerId = customerId;
		this.paymentDate = paymentDate;
		this.systemId = systemId;
	}



	public Integer getCustomerId() {
		return customerId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public Integer getSystemId() {
		return systemId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

}
