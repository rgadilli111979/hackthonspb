package com.mindtree.prediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.prediction.entity.CustomerEntity;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, String> {

}
