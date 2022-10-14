package com.mindtree.prediction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.prediction.pojo.CountryPojo;
import com.mindtree.prediction.service.PredictionService;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

	@Autowired
	private PredictionService service;

	/*
	 * @GetMapping("/getCountry/{countryName}") public ResponseEntity<CountryPojo>
	 * getRegCodeBase(@PathVariable String countryName) { return
	 * service.getCountryName(countryName); }
	 */

}
