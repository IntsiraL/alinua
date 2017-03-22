/**
 * 
 */
package com.m1Info.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import jdk.nashorn.api.scripting.JSObject;

/**
 * The corresponding Business class for  CV table
 * @author Team backend
 *
 */
public class CV implements Serializable {
	
	private JSObject description;
	private Timestamp lastUpdated;
	/**
	 * @return the description
	 */
	public JSObject getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(JSObject description) {
		this.description = description;
	}
	/**
	 * @return the lastUpdated
	 */
	public Timestamp getLastUpdated() {
		return lastUpdated;
	}
	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CV [description=" + description + ", lastUpdated=" + lastUpdated + "]";
	}
	
	

}
