package com.mindtree.prediction.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.prediction.entity.CountryEntity;
import com.mindtree.prediction.entity.CustomerEntity;
import com.mindtree.prediction.entity.InsurerName;
import com.mindtree.prediction.entity.PolicyEntity;
import com.mindtree.prediction.service.PredictionService;

@RestController
@RequestMapping("/data")
public class PredictionController {

	@Autowired
	private PredictionService service;

	@GetMapping("/countries")
	public ResponseEntity<List<CountryEntity>> getCountryName() {
		return service.getCountryName();
	}
	
	@GetMapping("/getInsurerDetails/{insurer_code}")
	public ResponseEntity<List<InsurerName>> getInsurerDetails(@PathVariable String insurer_code) {
		return service.getInsurerDetails(insurer_code);
	}
	
	@GetMapping("/getCustomersInfo")
	public ResponseEntity<List<CustomerEntity>> getCustomerDetails() {
		return service.getCustomerDetails();
	}
	
	@GetMapping("/getPolicyDetails")
	public ResponseEntity<List<PolicyEntity>> getPolicyDetails() {
		return service.getPolicyDetails();
	}
	
	@GetMapping("/expiringSoon/{days}")
    public ResponseEntity<List<PolicyEntity>> getPolivciesExpiringSoon(@PathVariable int days) {
        return service.getPolivciesExpiringSoon(days);
    }
	
	@GetMapping("/expiringSoonCountInDateRange")
    public ResponseEntity<Map<String,Integer>> getExpiringSoonCountInDateRange() {
        return service.getExpiringSoonCountInDateRange();
    }
	
}
