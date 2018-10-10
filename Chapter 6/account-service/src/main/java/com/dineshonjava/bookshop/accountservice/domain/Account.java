package com.dineshonjava.bookshop.accountservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Table(name="ACCOUNT")
@Entity
public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id//Pk
	@Column(name="ACCOUNTID")
	Integer accountId;
	
	@Column(name="NAME")
	String name;
	
	@Column(name="ADDRESS")
	String address;
	
	@Column(name="MOBILE")
	String mobile;
	
	@Column(name="EMAIL")
	String email;
	
	public Account() {
		super();
	}
	
	public Account(Integer accountId, String name, String address, String mobile, String email) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", address=" + address + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	
}
