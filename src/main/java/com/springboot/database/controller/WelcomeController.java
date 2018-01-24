package com.springboot.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.database.model.Person;
import com.springboot.database.service.PersonService;

@RestController
public class WelcomeController {
	
	
	@Autowired
	private PersonService personService;
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
	
	@RequestMapping(value="/save",method= RequestMethod.POST)
	public String savePerson(@RequestBody Person person){
		
		personService.savePerson(person);
		return "Saved Sucessfully";
	}

}
