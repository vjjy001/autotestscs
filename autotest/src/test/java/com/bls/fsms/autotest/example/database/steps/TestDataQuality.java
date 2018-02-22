package com.bls.fsms.autotest.example.database.steps;

import com.bls.fsms.autotest.steps.CucumberSpringRoot;

import cucumber.api.java.en.Then;

public class TestDataQuality extends CucumberSpringRoot{

	
	@Then("i test the fwk database")
	public void testFwkDB(){
		// AutoTestDao service2 = serviceCxt.getBean(AutoTestDaoImpl.class);
	    //  service2.getAllStates();
		
		System.out.println(starsSrvc.getAllStates());
		
	}
}
