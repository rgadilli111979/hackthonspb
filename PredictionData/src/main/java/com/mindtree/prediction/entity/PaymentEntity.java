
package com.mindtree.prediction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class PaymentEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "paymentAmount")
	private Integer paymentAmount;

	@Column(name = "paymentMethod")
	private String paymentMethod;
	
	@Column(name = "days_late")
	private String days_late;

	@Id
	@Column(name = "paymentDate")
	private String paymentDate;
	
	@EmbeddedId
	PaymentIdentity paymentIdentity;

	public PaymentIdentity getPaymentIdentity() {
		return paymentIdentity;
	}

	public void setPaymentIdentity(PaymentIdentity paymentIdentity) {
		this.paymentIdentity = paymentIdentity;
	}

	public Integer getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getDays_late() {
		return days_late;
	}

	public void setDays_late(String days_late) {
		this.days_late = days_late;
	}
	
	

	

}
