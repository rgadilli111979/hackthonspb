
package com.mindtree.prediction.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class CustomerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "customerId")
	private Integer customerId;

	@Column(name = "customerIncome")
	private String customerIncome;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerIncome() {
		return customerIncome;
	}

	public void setCustomerIncome(String customerIncome) {
		this.customerIncome = customerIncome;
	}

}
