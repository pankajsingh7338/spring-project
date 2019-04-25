package com.zwayam.sampleSpring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TestModel {

	@Id
	public String id;
	
	public String name;
	
	public String address;
	
}
