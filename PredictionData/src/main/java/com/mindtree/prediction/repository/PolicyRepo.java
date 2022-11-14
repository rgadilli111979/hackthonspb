package com.mindtree.prediction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.mindtree.prediction.entity.PolicyEntity;

@Repository
public interface PolicyRepo extends JpaRepository<PolicyEntity, String> {

	List<PolicyEntity> findAllByPolicyExpirationDateBetween(String currentData, String targetDate);

	@Query(value = "select substr(lpad(policy_number, 11,0),7,1) as policyType, count(*) from policy group by policyType", nativeQuery = true) 
	Object[][] getPieChartInfoForInsuranceType();
	
//	@Query(value = "select from policy p where p.policy_number =: policyId ")
//	PolicyEntity findPolicyBuPolicyNumber(@Param("policyId")String policyID);
	
}	
