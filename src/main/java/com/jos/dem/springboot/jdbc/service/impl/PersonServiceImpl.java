package com.jos.dem.springboot.jdbc.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.jos.dem.springboot.jdbc.model.Person;
import com.jos.dem.springboot.jdbc.service.PersonService;
import com.jos.dem.springboot.jdbc.repository.PersonRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  public List<Person> getPersons() {
    log.info("Querying for getting persons");
    return personRepository.findAll();
  }

}

