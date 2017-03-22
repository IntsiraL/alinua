/**
 * 
 */
package com.m1Info.bean;

import java.io.Serializable;
import java.util.Vector;

/**
 * The corresponding Business class for  Chat table
 * @author Team backend
 *
 */
public class Chat implements Serializable {
	
	private Vector<User> users;
	private int numDisplayed;
	/**
	 * @return the users
	 */
	public Vector<User> getUsers() {
		return users;
	}
	/**
	 * @param users the users to set
	 */
	public void setUsers(Vector<User> users) {
		this.users = users;
	}
	/**
	 * @return the numDisplayed
	 */
	public int getNumDisplayed() {
		return numDisplayed;
	}
	/**
	 * @param numDisplayed the numDisplayed to set
	 */
	public void setNumDisplayed(int numDisplayed) {
		this.numDisplayed = numDisplayed;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Chat [users=" + users + ", numDisplayed=" + numDisplayed + "]";
	}

}
