package com.bls.fsms.autotest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This is cucumber Junit Runner configuration class </br>
 * 1. configure plugin attributes to determine the format of output result 
 *   </br>eg html:target/html -- output as html report
 *   </br>eg json:target/json/cukeTest.json -- output as json file for later use</br>
 * 2. feature option helps cucumber to locate the Feature file </br>
 * 3. glue option helps to locate the step files 
 * 
 * @author JIAN_J
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin ={"pretty","html:target/html/"},  //output as html format report
		//plugin ={"pretty","json:target/json/cukeTest.json"},  //output as html format report
		//features ={"src/test/resources/features/examples/cukeAdvanceExamples.feature"},
		features ={"src/test/resources/features/examples/testFwk.feature"},
		//com.bls.fsms.autotest.examples.steps	com.bls.fsms.autotest.example.database.steps	
		glue={"com.bls.fsms.autotest.examples.steps"}
		//tags={"@testcuke"}  //only run testcuke sceniro
		//plugin ={"pretty"}
		//format={"pretty"},
		//features ={"src/test/resources"}
		)
public class RunCukesTest {

	
	
}
