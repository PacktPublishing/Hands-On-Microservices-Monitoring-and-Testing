/**
 * 
 */
package com.dineshonjava.bookshop.orderservice.domain;

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
@Table(name="ORDER")
public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	Long orderNumber;
	@Column
	String orderName;
	@Column
	Long orderedItem;
	@Column
	Integer accountId;
	
	public Order() {
		super();
	}

	public Long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Long getOrderedItem() {
		return orderedItem;
	}

	public void setOrderedItem(Long orderedItem) {
		this.orderedItem = orderedItem;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", orderName=" + orderName + ", orderedItem=" + orderedItem
				+ ", accountId=" + accountId + "]";
	}
	
}
