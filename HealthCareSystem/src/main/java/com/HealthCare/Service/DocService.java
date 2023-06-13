package com.HealthCare.Service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCare.Repository.DocRepository;
import com.HealthCare.entities.Doctors;



@Service
public class DocService {
	
	@Autowired
	DocRepository docr;

	public List<Doctors> getalldoc()
	{
		return docr.findAll();
		
	}
	
	

	
	public List<Doctors> getdoc(String specialization)
	{
		return docr.findDocBySpec(specialization);
	}
	
	
	
	public List<Doctors> getdocnm(String name)
	{
		return docr.findDocByname(name);
	}
	
	 
}
