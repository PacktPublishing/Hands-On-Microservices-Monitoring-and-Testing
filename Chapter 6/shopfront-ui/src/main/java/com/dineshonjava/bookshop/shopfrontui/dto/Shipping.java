/**
 * 
 */
package com.dineshonjava.bookshop.shopfrontui.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Dinesh.Rajput
 *
 */
public class Shipping implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long shippingId;
	Date shippingDate;
	Long orderId;
	String courrior;
	public Shipping() {
		super();
	}
	public Long getShippingId() {
		return shippingId;
	}
	public void setShippingId(Long shippingId) {
		this.shippingId = shippingId;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getCourrior() {
		return courrior;
	}
	public void setCourrior(String courrior) {
		this.courrior = courrior;
	}
	@Override
	public String toString() {
		return "Shipping [shippingId=" + shippingId + ", shippingDate=" + shippingDate + ", orderId=" + orderId
				+ ", courrior=" + courrior + "]";
	}
	
}
