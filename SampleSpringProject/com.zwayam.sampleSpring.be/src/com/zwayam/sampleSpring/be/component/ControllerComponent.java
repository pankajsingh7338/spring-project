package com.zwayam.sampleSpring.be.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zwayam.sampleSpring.model.TestModel;
import com.zwayam.sampleSpring.repository.TestModelRepo;

@Component
public class ControllerComponent {

	@Autowired
    TestModelRepo testModelRepo; 
	
	public TestModel testMethodFromComponent(){
		
		
		TestModel testModel = new TestModel();
		testModel.name = "Akash Gupta";
		testModel.address = "Bhopal, India";
		
		testModel = testModelRepo.save(testModel);
		
		return testModel;
		
	}
	
}
