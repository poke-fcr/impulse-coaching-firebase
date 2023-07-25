package com.impulse.classes.service.entity;

import java.util.List;

public class NoticeEntity {

	private String noticeId;
	private String title;
	private String description;
	
	public String getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public NoticeEntity(String noticeId, String title, String description) {
		super();
		this.noticeId = noticeId;
		this.title = title;
		this.description = description;
	}
	public NoticeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
