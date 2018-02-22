package com.bls.fsms.autotest.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StarsTestDaoImpl implements StarsTestDao{
	
	@Autowired
	@Qualifier("starsJDBC")
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>>  getAllStates(){
		StringBuilder sb = new StringBuilder();
		sb.append("select * from state");
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sb.toString());
		return list;
	}
}
