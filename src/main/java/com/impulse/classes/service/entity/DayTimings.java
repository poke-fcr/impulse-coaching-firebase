package com.impulse.classes.service.entity;

public class DayTimings {

	private String startTime;
	
	private String endTime;

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

	public DayTimings(String startTime, String endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public DayTimings() {
		super();
	}
	
	
}
