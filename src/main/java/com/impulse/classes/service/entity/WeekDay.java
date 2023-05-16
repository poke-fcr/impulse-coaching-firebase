package com.impulse.classes.service.entity;

public class WeekDay {
	
	private String day;
	private String startTime;
	private String endTime;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public WeekDay(String day, String startTime, String endTime) {
		super();
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public WeekDay() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
