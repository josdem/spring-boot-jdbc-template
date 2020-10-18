package com.jos.dem.springboot.jdbc.model;

import lombok.Data;

@Data
public class Person {

	private long id;
	private String nickname;
	private String email;
	private int ranking;
}
