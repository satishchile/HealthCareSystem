package com.HealthCare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCare.Repository.DocRepository;
import com.HealthCare.Service.DocService;
import com.HealthCare.entities.Doctors;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DocController {

	      @Autowired
	      DocService dservice;
          
	      @GetMapping("/gatalldoc")
	      public List<Doctors> gatalldoc()
	      {
	    	  return dservice.getalldoc();
	    	  
	      }
	      
      
	      
	     @GetMapping("/gatdoc")
	     public List<Doctors> gatdoc(@RequestParam("specialization")String str){
	    	 return dservice.getdoc(str);
	    	 
	     }
	     
	     

	     @GetMapping("/gatdocname")
	     public List<Doctors> gatdocname(@RequestParam("name")String str){
	    	 return dservice.getdocnm(str);
	    	 
	     }
	        
	             
	    }

