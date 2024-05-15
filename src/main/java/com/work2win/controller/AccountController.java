package com.work2win.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work2win.model.Account;
import com.work2win.repository.AccountRepository;


@RestController
@RequestMapping("/")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping("accounts")
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}
}
