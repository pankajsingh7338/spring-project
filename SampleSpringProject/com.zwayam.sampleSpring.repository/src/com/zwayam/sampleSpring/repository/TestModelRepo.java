package com.zwayam.sampleSpring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zwayam.sampleSpring.model.TestModel;

public interface TestModelRepo extends MongoRepository<TestModel, String> {
	
	
}
