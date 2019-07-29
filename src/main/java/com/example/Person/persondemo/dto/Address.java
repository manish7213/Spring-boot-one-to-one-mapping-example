package com.example.Person.persondemo.dto;

/**
 * @author manishkumar
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressId")
	private Long addressId;
	
	private String city;
	

	public Address(Long adressId, String city) {
		super();
		this.addressId = adressId;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAdressId() {
		return addressId;
	}

	public void setAdressId(Long adressId) {
		this.addressId = adressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + "]";
	}



	
	

}
