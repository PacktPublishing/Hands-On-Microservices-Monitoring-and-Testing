/**
 * 
 */
package com.dineshonjava.bookshop.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dineshonjava.bookshop.bookservice.domain.Book;
import com.dineshonjava.bookshop.bookservice.repository.BookRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping(value = "/account")
	public Iterable<Book> all (){
		return bookRepository.findAll();
	}
}
