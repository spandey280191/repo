package com.springboot.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.database.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, String>{

}
