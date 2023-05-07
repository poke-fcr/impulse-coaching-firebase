package com.impulse.classes.service.entity;

import java.util.List;

public class BatchEntity {

	private String batchId;
	private String batchName;
	private WeekDay weekDay;
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public WeekDay getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay;
	}
	public BatchEntity(String batchId, String batchName, WeekDay weekDay) {
		super();
		this.batchId = batchId;
		this.batchName = batchName;
		this.weekDay = weekDay;
	}
	public BatchEntity() {
		super();
	}
	
	

	
}
