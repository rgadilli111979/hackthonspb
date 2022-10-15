package com.mindtree.prediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.prediction.entity.PolicyEntity;

@Repository
public interface PolicyRepo extends JpaRepository<PolicyEntity, String> {

}
