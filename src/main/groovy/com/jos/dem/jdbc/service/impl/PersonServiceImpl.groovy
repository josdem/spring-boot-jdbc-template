package com.jos.dem.jdbc.service.impl

import org.springframework.jdbc.core.JdbcTemplate

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.jdbc.model.Person
import com.jos.dem.jdbc.service.PersonService

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class PersonServiceImpl implements PersonService {

  @Autowired
  JdbcTemplate jdbcTemplate

  Logger log = LoggerFactory.getLogger(this.class)

  List<Person> getPersons() {
    log.info("Querying for getting persons");
    jdbcTemplate.query(
      "SELECT id, nickname, email, ranking FROM person",
      ParameterizedBeanPropertyRowMapper.newInstance(Person.class)
    )
  }

}

