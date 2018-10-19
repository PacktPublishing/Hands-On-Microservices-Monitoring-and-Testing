/**
 * 
 */
package com.dineshonjava.bookshop.accountservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.dineshonjava.bookshop.accountservice.domain.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	Account findAccountByAccountId(Integer accountId);
}
