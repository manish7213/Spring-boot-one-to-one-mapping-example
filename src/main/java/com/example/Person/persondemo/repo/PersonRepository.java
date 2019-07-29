package com.example.Person.persondemo.repo;
/**
 * @author manishkumar
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Person.persondemo.dto.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
