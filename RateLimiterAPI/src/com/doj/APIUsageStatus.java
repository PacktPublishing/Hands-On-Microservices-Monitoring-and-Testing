/**
 * 
 */
package com.doj;

/**
 * @author Dinesh.Rajput
 *
 */
public class APIUsageStatus {
	
	String status;
	boolean isAllow;
	LicenseType allowedLimit;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isAllow() {
		return isAllow;
	}
	public void setAllow(boolean isAllow) {
		this.isAllow = isAllow;
	}
	public LicenseType getAllowedLimit() {
		return allowedLimit;
	}
	public void setAllowedLimit(LicenseType allowedLimit) {
		this.allowedLimit = allowedLimit;
	}
	
}
