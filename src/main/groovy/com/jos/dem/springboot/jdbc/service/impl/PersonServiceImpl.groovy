package com.jos.dem.springboot.jdbc.service.impl

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.springboot.jdbc.model.Person
import com.jos.dem.springboot.jdbc.service.PersonService
import com.jos.dem.springboot.jdbc.repository.PersonRepository

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class PersonServiceImpl implements PersonService {

  @Autowired
  PersonRepository personRepository

  Logger log = LoggerFactory.getLogger(this.class)

  List<Person> getPersons() {
    log.info 'Querying for getting persons'
    personRepository.findAll()
  }

}

