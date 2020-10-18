package com.jos.dem.springboot.jdbc.service;

import com.jos.dem.springboot.jdbc.model.Person;

import java.util.List;

public interface PersonService {

	Person findByNickname(String nickname);
	List<Person> getPersons();
	void updateRanking(String nickname, int ranking);

}
