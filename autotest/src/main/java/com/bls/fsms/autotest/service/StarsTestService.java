package com.bls.fsms.autotest.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bls.fsms.autotest.dao.StarsTestDao;

/**
 * This is example of test service in spring boot
 * 
 * @author JIAN_J
 *
 */
@Service
public class StarsTestService {

	@Autowired
	StarsTestDao starsTestDao;
	
	public List<Map<String, Object>>  getAllStates(){
		return starsTestDao.getAllStates();
	}
}
