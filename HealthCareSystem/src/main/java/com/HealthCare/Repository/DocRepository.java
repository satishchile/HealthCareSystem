package com.HealthCare.Repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.HealthCare.entities.Doctors;

@Repository
public interface DocRepository extends JpaRepository<Doctors, Integer> {

	
	
	
    @Query("select c from Doctors c where specialization = ?1")
    List<Doctors> findDocBySpec(String specialization);


    @Query("select c from Doctors c where name = ?1")
    List<Doctors> findDocByname(String nm);


}