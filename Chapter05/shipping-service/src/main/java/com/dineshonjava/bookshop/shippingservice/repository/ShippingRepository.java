/**
 * 
 */
package com.dineshonjava.bookshop.shippingservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.dineshonjava.bookshop.shippingservice.domain.Shipping;

/**
 * @author Dinesh.Rajput
 *
 */
public interface ShippingRepository extends CrudRepository<Shipping, Long> {

}
