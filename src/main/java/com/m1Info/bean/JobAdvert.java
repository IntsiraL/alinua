package com.m1Info.bean;

import java.util.Calendar;

/**
 * The corresponding Business class for  JobAdvert table
 * @author Team backend
 *
 */
public class JobAdvert implements java.io.Serializable {

	private String title;
	private String location;
	private String industry;
	private Calendar postDate;
	private String skills;
	private String description;
	private String degree;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public Calendar getPostDate() {
		return postDate;
	}
	public void setDate(Calendar date) {
		this.postDate = date;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	


	
	public String toString() {
		return "JobAdvert [title=" + title + ", location="
				+ location + ", industry=" + industry + ", date=" + postDate
				+ ", skills=" + skills + ", description=" + description
				+ ", degree=" + degree + "]";
	}
	
	
	
	
	

}
