package com.jos.dem.jdbc.repository

import org.springframework.stereotype.Repository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper

import com.jos.dem.jdbc.model.Person

@Repository
class PersonRepository {

  @Autowired
  JdbcTemplate jdbcTemplate

  public List<Person> findAll() {
    jdbcTemplate.query(
      "SELECT id, nickname, email, ranking FROM person",
      ParameterizedBeanPropertyRowMapper.newInstance(Person.class)
    )
  }

}
