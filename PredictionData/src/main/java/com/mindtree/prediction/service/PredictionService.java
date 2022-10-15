package com.mindtree.prediction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mindtree.prediction.entity.CountryEntity;
import com.mindtree.prediction.entity.CustomerEntity;
import com.mindtree.prediction.entity.InsurerName;
import com.mindtree.prediction.entity.PaymentEntity;
import com.mindtree.prediction.entity.PolicyEntity;
import com.mindtree.prediction.pojo.CountryPojo;
import com.mindtree.prediction.repository.CountryRepo;
import com.mindtree.prediction.repository.CustomerRepo;
import com.mindtree.prediction.repository.InsurerRepo;
import com.mindtree.prediction.repository.PaymentRepo;
import com.mindtree.prediction.repository.PolicyRepo;

@Service
public class PredictionService {

	@Autowired
	CountryRepo countryRepo;

	@Autowired
	InsurerRepo insurerRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	PolicyRepo policyRepo;
	
	@Autowired
	PaymentRepo paymentRepo;
	
	public ResponseEntity<List<CountryEntity>> getCountryName() {

		List<CountryEntity> countryList = countryRepo.findAll();

		if (countryList.size() > 0) {
			return new ResponseEntity<>(countryList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(countryList, HttpStatus.NOT_FOUND);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<List<InsurerName>> getInsurerDetails(String insurer_code) {
		Optional<InsurerName> insurerDetailsList = insurerRepo.findById(insurer_code);
		if (insurerDetailsList.isPresent()) {
			return new ResponseEntity(insurerDetailsList.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity(insurerDetailsList.get(), HttpStatus.NOT_FOUND);
		}

	}

	public ResponseEntity<List<CustomerEntity>> getCustomerDetails() {
		List<CustomerEntity> customerList = customerRepo.findAll();
		if (customerList.size() > 0) {
			return new ResponseEntity<>(customerList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(customerList, HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<List<PolicyEntity>> getPolicyDetails() {
		List<PolicyEntity> policyList = policyRepo.findAll();
		if (policyList.size() > 0) {
			return new ResponseEntity<>(policyList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(policyList, HttpStatus.NOT_FOUND);
		}
	}
	
	/*
	 * @SuppressWarnings({ "unchecked", "rawtypes" }) public
	 * ResponseEntity<List<PaymentEntity>> getPaymentDetails(String paymentDate) {
	 * Optional<PaymentEntity> paymentDetailsList =
	 * paymentRepo.findById(paymentDate);
	 * 
	 * if (paymentDetailsList.isPresent()) { return new
	 * ResponseEntity(paymentDetailsList.get(), HttpStatus.OK); } else { return new
	 * ResponseEntity(paymentDetailsList.get(), HttpStatus.NOT_FOUND); } }
	 */

}
