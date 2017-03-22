/**
 * 
 */
package com.m1Info.bean;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Vector;


/**
 * The corresponding Business class for  Projet table
 * @author Team backend
 *
 */
public class Projet implements java.io.Serializable {
	private String name;
	private Calendar start;
	public Calendar end;
	private String url;
	private String topics;
	public Vector<User> memebers;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the start
	 */
	public Calendar getStart() {
		return start;
	}
	
	/**
	 * @param start the start to set
	 */
	public void setStart(Calendar start) {
		this.start = start;
	}
	
	/**
	 * @return the end
	 */
	public Calendar getEnd() {
		return end;
	}
	/**
	 * @param end the end to set
	 */
	public void setEnd(Calendar end) {
		this.end = end;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the topics
	 */
	public String getTopics() {
		return topics;
	}
	
	/**
	 * @param topics the topics to set
	 */
	public void setTopics(String topics) {
		this.topics = topics;
	}
	
	/**
	 * @return the memebers
	 */
	public Vector<User> getMemebers() {
		return memebers;
	}
	
	/**
	 * @param memebers the memebers to set
	 */
	public void setMemebers(Vector<User> memebers) {
		this.memebers = memebers;
	}
    
}
