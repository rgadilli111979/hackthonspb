package com.mindtree.prediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.prediction.entity.CountryEntity;
import com.mindtree.prediction.pojo.CountryPojo;

@Repository
public interface CountryRepo extends JpaRepository<CountryEntity, String> {

}
