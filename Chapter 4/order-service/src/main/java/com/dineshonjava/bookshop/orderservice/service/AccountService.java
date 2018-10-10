/**
 * 
 */
package com.dineshonjava.bookshop.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Dinesh.Rajput
 *
 */
@FeignClient("account-service")
public interface AccountService {
	
}
