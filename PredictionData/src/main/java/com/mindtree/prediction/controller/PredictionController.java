package com.mindtree.prediction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.prediction.entity.CountryEntity;
import com.mindtree.prediction.service.PredictionService;

@RestController
@RequestMapping("/prediction")
public class PredictionController {

	@Autowired
	private PredictionService service;

	@GetMapping("/getCountry")
	public ResponseEntity<List<CountryEntity>> getCountryName() {
		return service.getCountryName();
	}

}
