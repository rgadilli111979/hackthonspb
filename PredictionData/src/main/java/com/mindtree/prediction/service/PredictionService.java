package com.mindtree.prediction.service;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mindtree.prediction.entity.CountryEntity;
import com.mindtree.prediction.entity.CustomerEntity;
import com.mindtree.prediction.entity.InsurerName;
import com.mindtree.prediction.entity.PolicyEntity;
import com.mindtree.prediction.repository.CountryRepo;
import com.mindtree.prediction.repository.CustomerRepo;
import com.mindtree.prediction.repository.InsurerRepo;
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

//	@Autowired
//	PaymentRepo paymentRepo;

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

	public ResponseEntity<List<PolicyEntity>> getPolivciesExpiringSoon(int days) {
		return new ResponseEntity<>(getPolivciesExpiringSoonPrivate(days), HttpStatus.OK);

		// return null;
	}

	private List<PolicyEntity> getPolivciesExpiringSoonPrivate(int days) {

		long millis = System.currentTimeMillis();
		java.util.Date date = new java.util.Date(millis);

		java.util.Date udate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(udate.getTime());

		System.out.println(date);
		return policyRepo.findAllByPolicyExpirationDateBetween(sqlDate.toString(), addDays(sqlDate, days));

		// return null;

	}

	private static String addDays(Date date, int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		if (days > 7) {
			c.add(Calendar.MONTH, Math.round(days / 30));
		} else {
			c.add(Calendar.DATE, days);
		}
		return new Date(c.getTimeInMillis()).toString();
	}

	public ResponseEntity<Map<String, Integer>> getExpiringSoonCountInDateRange() {
		Map<String, Integer> dateRangeExpireCount = new HashMap<String, Integer>();

		dateRangeExpireCount.put("1 WEEK", getPolivciesExpiringSoonPrivate(7).size());
		dateRangeExpireCount.put("1 MONTH", getPolivciesExpiringSoonPrivate(32).size());
		dateRangeExpireCount.put("2 MONTHS", getPolivciesExpiringSoonPrivate(66).size());
		dateRangeExpireCount.put("3 MONTHS", getPolivciesExpiringSoonPrivate(95).size());
		return new ResponseEntity<>(dateRangeExpireCount, HttpStatus.OK);
	}

	public ResponseEntity<Map<String, Object>> getPieChartInfoForInsuranceType() {
		Object[][] objList = policyRepo.getPieChartInfoForInsuranceType();
		Map<String, Object> pieChatMap = new HashMap<String, Object>();

		for (Object[] object : objList) {
			if (((String) object[0]).trim().equals("1")) {
				pieChatMap.put("1-Business Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("2")) {
				pieChatMap.put("2-Compensation Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("3")) {
				pieChatMap.put("3-Health Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("4")) {
				pieChatMap.put("4-Home Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("5")) {
				pieChatMap.put("5-Income Protection Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("6")) {
				pieChatMap.put("6-Life Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("7")) {
				pieChatMap.put("7-Pet Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("8")) {
				pieChatMap.put("8-Travel Insurance", object[1]);
			} else if (((String) object[0]).trim().equals("9")) {
				pieChatMap.put("9-Vehicle Insurance", object[1]);
			}

		}
		return new ResponseEntity<>(pieChatMap, HttpStatus.OK);

	}

}
