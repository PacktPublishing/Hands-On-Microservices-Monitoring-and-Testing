/**
 * 
 */
package com.dineshonjava.bookshop.shippingservice.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Dinesh.Rajput
 *
 */
@FeignClient("order-service")
public interface OrderService {

}
