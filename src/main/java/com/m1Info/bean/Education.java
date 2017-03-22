/**
 * 
 */
package com.m1Info.bean;

import java.io.Serializable;
import java.util.Vector;

/**
 * The corresponding Business class for  Education table
 * @author Team backend
 *
 */
public class Education implements Serializable {

	private String label;
	private String degree;
	private String headline;
	private Vector<Course> courses;
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * @return the headline
	 */
	public String getHeadline() {
		return headline;
	}
	/**
	 * @param headline the headline to set
	 */
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	/**
	 * @return the courses
	 */
	public Vector<Course> getCourses() {
		return courses;
	}
	/**
	 * @param courses the courses to set
	 */
	public void setCourses(Vector<Course> courses) {
		this.courses = courses;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Education [label=" + label + ", degree=" + degree + ", headline=" + headline + "]";
	}
	
	
}
