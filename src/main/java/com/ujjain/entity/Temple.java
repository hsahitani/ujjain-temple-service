package com.ujjain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="temple")
public class Temple {

	@Id
	private long id;
	
	private String name;
	
	private Address address;
}
