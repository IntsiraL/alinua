package com.m1Info.bean;

import java.sql.Timestamp;
import javax.xml.crypto.dsig.XMLObject;



/**
 * The corresponding Business class for User table
 * @author Team backend
 *
 */
public class User  implements java.io.Serializable {
	
	private String email;
	private String password;
	private String pictureUrl;
	private XMLObject description;
	private Timestamp lastUpdated;
	private int id;
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the pictureUrl
	 */
	public String getPictureUrl() {
		return pictureUrl;
	}
	/**
	 * @param pictureUrl the pictureUrl to set
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	/**
	 * @return the description
	 */
	public XMLObject getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(XMLObject description) {
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
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", pictureUrl=" + pictureUrl + ", description="
				+ description + ", lastUpdated=" + lastUpdated + ", id=" + id + "]";
	}
	
	

}
