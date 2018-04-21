package com.jos.dem.springboot.jdbc.repository

import org.springframework.stereotype.Repository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.springboot.jdbc.model.Person

@Repository
class PersonRepository {

  @Autowired
  JdbcTemplate jdbcTemplate

  List<Person> findAll() {
    jdbcTemplate.query(
      'SELECT * FROM person',
      BeanPropertyRowMapper.newInstance(Person.class)
    )
  }

}
