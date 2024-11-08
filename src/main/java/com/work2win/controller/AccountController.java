package com.work2win.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work2win.model.Account;
import com.work2win.model.AccountTransfer;
import com.work2win.repository.AccountRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping("accounts")
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}
	
	@PostMapping("accountTransfer")
	public void sendMoney(@RequestBody AccountTransfer accountTransfer) {
		
		int fromAccount = accountTransfer.getFromAccount();
		int toAccount = accountTransfer.getToAccount();
		float amount = accountTransfer.getAmount();
		
		//accountRepository.deposit(toAccount, amount);
	    //accountRepository.withdraw(fromAccount, amount);
		System.out.println("data is "+accountTransfer);
	}
}
