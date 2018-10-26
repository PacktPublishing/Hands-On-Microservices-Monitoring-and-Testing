/**
 * 
 */
package com.dineshonjava.bookshop.shopfrontui.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Dinesh.Rajput
 *
 */
@FeignClient("book-service")
public interface BookService {

}
