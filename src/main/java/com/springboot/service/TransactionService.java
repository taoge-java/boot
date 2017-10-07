package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	@SuppressWarnings("unused")
	public void transaction(){
		jdbcTemplate.update("update system_admin set login_count=100 where id=1");
		int i = 1/0;
		jdbcTemplate.update("update system_admin set login_count=30 where id=1");
	}
}
