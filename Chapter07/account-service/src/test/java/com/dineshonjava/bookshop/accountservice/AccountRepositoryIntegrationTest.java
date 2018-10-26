/**
 * 
 */
package com.dineshonjava.bookshop.accountservice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dineshonjava.bookshop.accountservice.domain.Account;
import com.dineshonjava.bookshop.accountservice.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryIntegrationTest {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@After
	public void tearDown() throws Exception {
		 accountRepository.deleteAll();
	}
	
	@Test
	public void shouldSaveAndFetchAccount() throws Exception {
		Account accountA = new Account(1002, "Arnav Rajput", "Noida", "9431XXX133", "arnav.mail@my.com");
		accountRepository.save(accountA);
		Account accountB = accountRepository.findAccountByAccountId(1002);
		assertThat(accountB, is(accountA));
	}
}
