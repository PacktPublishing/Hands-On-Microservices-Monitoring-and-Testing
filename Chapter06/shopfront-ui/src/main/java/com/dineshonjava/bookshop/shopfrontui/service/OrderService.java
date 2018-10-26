/**
 * 
 */
package com.dineshonjava.bookshop.shopfrontui.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Dinesh.Rajput
 *
 */
@FeignClient("order-service")
public interface OrderService {

}
