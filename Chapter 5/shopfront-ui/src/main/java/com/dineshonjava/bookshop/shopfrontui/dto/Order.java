/**
 * 
 */
package com.dineshonjava.bookshop.shopfrontui.dto;

import java.io.Serializable;

/**
 * @author Dinesh.Rajput
 *
 */
public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long orderNumber;
	String orderName;
	Long orderedItem;
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
