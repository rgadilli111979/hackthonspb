package com.mindtree.prediction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mindtree.prediction.entity.CountryEntity;
import com.mindtree.prediction.pojo.CountryPojo;
import com.mindtree.prediction.repository.CountryRepo;

@Service
public class PredictionService {

	@Autowired
	CountryRepo countryRepo;

	public ResponseEntity<List<CountryEntity>> getCountryName() {

		List<CountryEntity> countryList = countryRepo.findAll();

		if (countryList.size() > 0) {
			return new ResponseEntity<>(countryList, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(countryList, HttpStatus.NOT_FOUND);
		}
	}

}
