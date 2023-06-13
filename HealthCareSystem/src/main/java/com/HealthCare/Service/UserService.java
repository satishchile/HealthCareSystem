package com.HealthCare.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HealthCare.Repository.UserRepo;
import com.HealthCare.entities.User;

@Service
public class UserService {

	@Autowired
	UserRepo lrepo;
	
	public boolean getLogin(String uid , String pwd)
	{
		//System.out.println(uid+" "+pwd);
		User l;
		boolean flage =false; 
		Optional<User> ol =lrepo.getLogin(uid, pwd);
		
		try {
			
			l=ol.get();
			flage=true;
		}
		catch(Exception e)
		{
			System.out.println("null");
			l=null;
		}
		return flage;
	
    }
	
	
	public List<User> getAll()
	{
		return lrepo.findAll();
	}
	
	
//	public getById(int loginid)
//	{
//		return lrepo.findById(loginid).get();
//	}
	
	public User save(User l)
	{
		return lrepo.save(l);
	}
	
}
