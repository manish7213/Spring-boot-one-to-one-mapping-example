package com.example.Person.persondemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Person.persondemo.dto.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
