package com.HealthCare.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "bloodbroup")
	String bloodbroup;
	
	@Column(name = "age")
	String age;
	 
	
	@Column(name = "phoneno")
	String phoneno;
	

	@Column(name = "address")
	String address;
	
	
	@Column(name = "pincode")
	String pincode;
	
	
	@Column(name = "email")
	String email;
	
	@Column(name = "password")
	String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String bloodbroup,String age, String phoneno, String address, String pincode, String email,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.bloodbroup = bloodbroup;
		this.age=age;
		this.phoneno = phoneno;
		this.address = address;
		this.pincode = pincode;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBloodbroup() {
		return bloodbroup;
	}

	public void setBloodbroup(String bloodbroup) {
		this.bloodbroup = bloodbroup;
	}
     
	public String getAge() {
		return age;
	}
	
	public void setAge() {
		
		this.age=age;
	}
	
	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bloodbroup=" + bloodbroup + ",age="+ age+", phoneno=" + phoneno
				+ ", address=" + address + ", pincode=" + pincode + ", email=" + email + ", password=" + password + "]";
	}
	
}
