package com.ujjain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection="address")
@Data
public class Address {

	@Id
	private Long id;
	
	private String houseNumber;
	
	private String streetName;
	
	private String area;
	
	private String city;
	
	private String country;
	
	private long pin;
}
