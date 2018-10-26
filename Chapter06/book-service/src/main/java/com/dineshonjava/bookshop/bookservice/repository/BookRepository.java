/**
 * 
 */
package com.dineshonjava.bookshop.bookservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.dineshonjava.bookshop.bookservice.domain.Book;

/**
 * @author Dinesh.Rajput
 *
 */
public interface BookRepository extends CrudRepository<Book, String> {
	
	//List<Book> findAllbyAuthor(String author);
	
	//List<Book> findAllbycategory(String category);
}
