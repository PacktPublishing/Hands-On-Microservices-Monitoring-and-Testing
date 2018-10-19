/**
 * 
 */
package com.dineshonjava.bookshop.accountservice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.dineshonjava.bookshop.accountservice.controller.AccountController;
import com.dineshonjava.bookshop.accountservice.domain.Account;
import com.dineshonjava.bookshop.accountservice.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
public class AccountControllerTest {
	
	AccountController accountController;
	
	@Mock
	AccountRepository accountRepository;
	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
		accountController = new AccountController(accountRepository);
	}
	
	@Test
	public void findByAccountId (){
		Account account = new Account(1003, "Arnav Rajput", "Noida", "9832XXX23", "arnav.raj@mail.com");
		given(accountRepository.findAccountByAccountId(10003)).willReturn(account);
		Account acct = accountController.findByAccountId(10003);
        assertThat(acct.getName(), is("Arnav Rajput"));
	}
}
