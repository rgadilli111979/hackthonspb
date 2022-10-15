package com.mindtree.prediction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.prediction.entity.InsurerName;

@Repository
public interface InsurerRepo extends JpaRepository<InsurerName, String> {

}
