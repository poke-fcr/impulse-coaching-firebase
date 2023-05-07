package com.impulse.classes.service.entity;

import java.util.Map;

public class WeekDay {
	
	private DayTimings monday;
	private DayTimings tuesday;
	private DayTimings wednesday;
	private DayTimings thursday;
	private DayTimings friday;
	private DayTimings saturday;
	private DayTimings sunday;
	public DayTimings getMonday() {
		return monday;
	}
	public void setMonday(DayTimings monday) {
		this.monday = monday;
	}
	public DayTimings getTuesday() {
		return tuesday;
	}
	public void setTuesday(DayTimings tuesday) {
		this.tuesday = tuesday;
	}
	public DayTimings getWednesday() {
		return wednesday;
	}
	public void setWednesday(DayTimings wednesday) {
		this.wednesday = wednesday;
	}
	public DayTimings getThursday() {
		return thursday;
	}
	public void setThursday(DayTimings thursday) {
		this.thursday = thursday;
	}
	public DayTimings getFriday() {
		return friday;
	}
	public void setFriday(DayTimings friday) {
		this.friday = friday;
	}
	public DayTimings getSaturday() {
		return saturday;
	}
	public void setSaturday(DayTimings saturday) {
		this.saturday = saturday;
	}
	public DayTimings getSunday() {
		return sunday;
	}
	public void setSunday(DayTimings sunday) {
		this.sunday = sunday;
	}
	public WeekDay(DayTimings monday, DayTimings tuesday, DayTimings wednesday, DayTimings thursday, DayTimings friday,
			DayTimings saturday, DayTimings sunday) {
		super();
		this.monday = monday;
		this.tuesday = tuesday;
		this.wednesday = wednesday;
		this.thursday = thursday;
		this.friday = friday;
		this.saturday = saturday;
		this.sunday = sunday;
	}
	public WeekDay() {
		super();
	}
	
	
	

	

	
	
}
