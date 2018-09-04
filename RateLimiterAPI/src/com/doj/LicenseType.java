/**
 * 
 */
package com.doj;

/**
 * @author Dinesh.Rajput
 *
 */
public enum LicenseType {
	
	LOW(10),
	MEDIUM(20),
	HIGH(50);
	
	private final int allowdLimit;
	
	LicenseType(final int allowdLimit){
		this.allowdLimit = allowdLimit;
	}
	
	public String toString() {
        return allowdLimit+"";
    }
}
