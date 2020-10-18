package com.jos.dem.springboot.jdbc;

import com.jos.dem.springboot.jdbc.model.Person;
import com.jos.dem.springboot.jdbc.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Slf4j
@SpringBootApplication
public class JdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }


    @Bean
    CommandLineRunner run(PersonService personService){
        return args -> {
            personService.updateRanking("martin", 5);
            List<Person> persons = personService.getPersons();
            persons.forEach(person -> log.info("person: {}", person));
        };
    }

}
