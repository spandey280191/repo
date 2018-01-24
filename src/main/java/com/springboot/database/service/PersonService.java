package com.springboot.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.database.model.Person;
import com.springboot.database.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	public void savePerson(Person person){
		
		personRepository.save(person);
		
	}
	
}
