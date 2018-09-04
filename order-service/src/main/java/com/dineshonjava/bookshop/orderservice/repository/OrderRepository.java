/**
 * 
 */
package com.dineshonjava.bookshop.orderservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.dineshonjava.bookshop.orderservice.domain.Order;

/**
 * @author Dinesh.Rajput
 *
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

}
