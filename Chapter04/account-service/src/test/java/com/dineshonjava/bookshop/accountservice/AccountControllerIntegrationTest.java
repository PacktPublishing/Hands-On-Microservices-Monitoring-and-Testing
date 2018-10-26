/**
 * 
 */
package com.dineshonjava.bookshop.accountservice;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.dineshonjava.bookshop.accountservice.controller.AccountController;
import com.dineshonjava.bookshop.accountservice.domain.Account;
import com.dineshonjava.bookshop.accountservice.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = AccountController.class)
public class AccountControllerIntegrationTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AccountRepository accountRepository;
	
	@Test
	public void shouldReturnFullName() throws Exception {
		Account rushika = new Account(1003, "Rushika Rajput", "Noida", "9832XXX23", "rushika.raj@mail.com");
		given(accountRepository.findAccountByAccountId(10003)).willReturn(rushika);
		mockMvc.perform(get("/account/10003"))
		.andExpect(content().json("{\"accountId\":1003,\"name\":\"Rushika Rajput\",\"address\":\"Noida\",\"mobile\":\"9832XXX23\",\"email\":\"rushika.raj@mail.com\"}"))
		.andExpect(status().is2xxSuccessful());
	}

}
