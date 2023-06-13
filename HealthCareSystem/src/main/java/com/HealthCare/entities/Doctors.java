package com.HealthCare.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	int id;

	@Column
	private String name;
	
	@Column
    private String specialization;
	
	@Column(name="doctorphone")
	private String phone;
	
	
	
	@Column(name="ambulance")
    private String ambulance;
    
	
	@Column
    private String address;
	
	@Column
	private String landmark;
	
	
	@Column
	private String pincode;


	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctors(int id, String name, String specialization, String phone, String ambulance, String address,
			String landmark, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.phone = phone;
		this.ambulance = ambulance;
		this.address = address;
		this.landmark = landmark;
		this.pincode = pincode;
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


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getambulance() {
		return ambulance;
	}


	public void setambulance(String ambulance) {
		this.ambulance = ambulance;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Doctors [id=" + id + ", name=" + name + ", specialization=" + specialization + ", phone=" + phone
				+ ", ambulance=" + ambulance + ", address=" + address + ", landmark=" + landmark
				+ ", pincode=" + pincode + "]";
	}

}
