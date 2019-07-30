package com.example.Person.persondemo.controller;

/**
 * @author manishkumar
 */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Person.persondemo.dto.Address;
import com.example.Person.persondemo.dto.Person;
import com.example.Person.persondemo.repo.AddressRepository;
import com.example.Person.persondemo.repo.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@GetMapping("/person/{id}")
	public Optional<Person> getPerson(@PathVariable Long id) {
		
		return personRepo.findById(id);
		
	}
	
	@GetMapping("/person/all")
	public List<Person> getAllPersons() {
		
		return personRepo.findAll();
		
	}
	
	@GetMapping("/address/all")
	public List<Address> getAllAddresses() {
		
		return addressRepo.findAll();
		
	}
	
	
	@GetMapping("/address/{id}")
	public Optional<Address> getAddress(@PathVariable Long id) {
		
		return addressRepo.findById(id);
		
	}
	
	@PostMapping("/person/save")
	public void savePerson(@RequestBody Person person) {
		
		personRepo.save(person);
	}
	
	@PostMapping("/address/save")
	public void saveAddress(@RequestBody Address address) {
		
		addressRepo.save(address);
	}
	
	@DeleteMapping("/person/{pid}")
	public void deletePerson(@PathVariable Long pid) {
		
		personRepo.deleteById(pid);
	}
	
	@DeleteMapping("/address/{aid}")
	public void deleteAddress(@PathVariable Long aid) {
		
		addressRepo.deleteById(aid);
	}
}
