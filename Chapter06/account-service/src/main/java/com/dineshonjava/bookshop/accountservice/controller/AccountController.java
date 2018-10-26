package com.dineshonjava.bookshop.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dineshonjava.bookshop.accountservice.domain.Account;
import com.dineshonjava.bookshop.accountservice.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
	public AccountController(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@PostMapping(value = "/account")
	public Account save (@RequestBody Account account){
		return accountRepository.save(account);
	}
	
	@GetMapping(value = "/account")
	public Iterable<Account> all (){
		return accountRepository.findAll();
	}
	
	@GetMapping(value = "/account/{accountId}")
	public Account findByAccountId (@PathVariable Integer accountId){
		return accountRepository.findAccountByAccountId(accountId);
	}
	
	@PutMapping(value = "/account")
	public Account update (@RequestBody Account account){
		return accountRepository.save(account);
	}
	
	@DeleteMapping(value = "/account")
	public void delete (@RequestBody Account account){
		accountRepository.delete(account);
	}
}
