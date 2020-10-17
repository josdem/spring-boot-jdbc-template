package com.jos.dem.springboot.jdbc.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.jos.dem.springboot.jdbc.model.Person;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

  private final JdbcTemplate jdbcTemplate;

  public List<Person> findAll() {
    return jdbcTemplate.query(
      "SELECT * FROM person",
      BeanPropertyRowMapper.newInstance(Person.class)
    );
  }

}
