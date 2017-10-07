package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.TransactionService;

@RestController
public class TransactionManagerController {

	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping("/transaction")
	public void transaction(){
		transactionService.transaction();
	}
}
