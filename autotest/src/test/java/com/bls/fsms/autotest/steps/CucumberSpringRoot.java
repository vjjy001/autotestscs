package com.bls.fsms.autotest.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.bls.fsms.autotest.Application;
import com.bls.fsms.autotest.service.StarsTestService;

/**
 * This is spring boot test configuration class which is used as centralized database service root
 * Steps files must extended this class if tester need to testing database 
 *  
 * 
 * @author JIAN_J
 *
 */
@SpringBootTest(classes = Application.class)
@ContextConfiguration
public class CucumberSpringRoot {
	
	@Autowired
	public StarsTestService starsSrvc;

}
