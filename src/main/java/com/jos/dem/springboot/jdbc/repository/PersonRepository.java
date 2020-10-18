package com.jos.dem.springboot.jdbc.repository;

import com.jos.dem.springboot.jdbc.model.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
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

  public int updateRanking(String nickname, int ranking) {
    return jdbcTemplate.update("UPDATE person SET ranking = ? WHERE nickname = ?", ranking, nickname);
  }

}
