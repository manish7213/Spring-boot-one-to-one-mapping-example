package com.example.Person.persondemo.dto;
/**
 * @author manishkumar
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pid")
	private Long pid;
	
	private String name;
	
	private String designation;
	
	
	@OneToOne
	@JoinColumn(name = "addressId", referencedColumnName = "addressId") //which id of the address object has to be mapped with
	private Address address;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person(Long pid, String name, String designation, Address address) {
		super();
		this.pid = pid;
		this.name = name;
		this.designation = designation;
		this.address = address;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", designation=" + designation + ", address=" + address + "]";
	}
	
	

	
}
