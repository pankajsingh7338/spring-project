package com.zwayam.sampleSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zwayam.sampleSpring.be.component.ControllerComponent;
import com.zwayam.sampleSpring.model.TestModel;

@RestController
@RequestMapping("/Controller")
public class Controller {

	@Autowired
	ControllerComponent controllerComponent;
	
	@RequestMapping("/testMethod")
	public @ResponseBody TestModel testMethod(){
		return controllerComponent.testMethodFromComponent();
	}
	
}
