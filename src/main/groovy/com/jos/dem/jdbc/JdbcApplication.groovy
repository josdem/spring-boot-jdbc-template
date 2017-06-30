package com.jos.dem.jdbc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext

import com.jos.dem.jdbc.service.PersonService

@SpringBootApplication
class JdbcApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run JdbcApplication, args
    context.getBean(PersonService.class).getPersons()
	}

}
