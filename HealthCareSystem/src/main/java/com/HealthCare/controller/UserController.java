package com.HealthCare.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.HealthCare.Service.UserService;
import com.HealthCare.entities.LoginCheck;
import com.HealthCare.entities.User;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {
    
	 
	@Autowired
    UserService lservice;

    @PostMapping("/checkLogin")
    public Status checkLogin(@RequestBody LoginCheck lcheck)
	{
    	 if(lservice.getLogin(lcheck.getEmail(),lcheck.getPassword()))
    	 {
    		 return Status.SUCCESS;
    	 }
    	 else
    	 {
    		 return Status.FAILURE;
    	 }
	}	
    
    
    
    
    @GetMapping("/all")
	public List<User> getAll()
	{
		return lservice.getAll();
	}
    
    
    @PostMapping("/register")
    public Status registerUser(@RequestBody User user) {
    	
         lservice.save(user);
        return Status.SUCCESS;
    }
  
}
