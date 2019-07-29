package com.example.Person.persondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Person.persondemo.dto.Address;
import com.example.Person.persondemo.dto.Person;
import com.example.Person.persondemo.repo.AddressRepository;
import com.example.Person.persondemo.repo.PersonRepository;

@SpringBootApplication
public class PersonDemoApplication {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(PersonDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initializeDb() {

		return args ->  {

				Address a1 = new Address();
				a1.setCity("Patna");
				Person p1 = new Person();
				p1.setName("Manish");
				p1.setDesignation("SE");
				p1.setAddress(a1);
				Address a2 = new Address();
				a2.setCity("Bangalore");
				Person p2 = new Person();
				p2.setName("Kumar");
				p2.setDesignation("SSE");
				p2.setAddress(a2);
				
				addressRepository.save(a1);
				addressRepository.save(a2);
				
				personRepository.save(p1);
				personRepository.save(p2);

		};
	}

}
