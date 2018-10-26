/**
 * 
 */
package com.dineshonjava.bookshop.shippingservice.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Entity
@Table(name="SHIPPING")
public class Shipping implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column
	Long shippingId;
	@Column
	Date shippingDate;
	@Column
	Long orderId;
	@Column
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
