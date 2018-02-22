package com.bls.fsms.autotest.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bls.fsms.autotest.service.StarsTestService;

/**
 * This is example of test controller in spring boot
 * 
 * @author JIAN_J
 *
 */
@RestController
@CrossOrigin()
public class TestController {

	@Autowired
	StarsTestService starsSrvc;
	
	@RequestMapping(value = "/getstates", method = RequestMethod.GET)
    public @ResponseBody List<Map<String, Object>> getAllStates(){	
	
		return starsSrvc.getAllStates();
	}
}
