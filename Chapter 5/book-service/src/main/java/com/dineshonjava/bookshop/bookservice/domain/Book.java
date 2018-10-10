/**
 * 
 */
package com.dineshonjava.bookshop.bookservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Entity
@Table(name="BOOK")
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	@Id
	String isbn;
	@Column
	String title;
	@Column
	String publication;
	@Column
	String category;
	@Column
	Double price;
	@Column
	String author;
	public Book() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", publication=" + publication + ", category=" + category
				+ ", price=" + price + ", author=" + author + "]";
	}
	
}
