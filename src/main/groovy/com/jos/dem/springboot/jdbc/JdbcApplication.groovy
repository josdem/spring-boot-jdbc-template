package com.jos.dem.springboot.jdbc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

import com.jos.dem.jdbc.model.Person
import com.jos.dem.jdbc.service.PersonService

@SpringBootApplication
class JdbcApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run JdbcApplication, args
    List<Person> persons = context.getBean(PersonService.class).getPersons()
    persons.each {
      println "person: ${it.dump()}"
    }
	}

}
