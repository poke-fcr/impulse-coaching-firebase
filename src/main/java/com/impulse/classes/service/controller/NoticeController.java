package com.impulse.classes.service.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impulse.classes.service.entity.NoticeEntity;
import com.impulse.classes.service.service.NoticeService;

@RestController
@RequestMapping("/notice")
@CrossOrigin(origins =  {"http://localhost:4200", "https://impulse-coaching.web.app", "*"}, allowedHeaders = "*")
public class NoticeController {
	
	@Autowired
	NoticeService noticeService;
	
	@PostMapping("/saveNotice")
	public Map<String, String> saveBatch(@RequestBody NoticeEntity notice) throws ExecutionException {
		return this.noticeService.saveNotice(notice);
	}
	
	@GetMapping("/getNotices")
	public List<NoticeEntity> getAllBatches(){
		return this.noticeService.getAllNotices();
	}
	
	@DeleteMapping("/deleteNotice/{noticeId}")
	public Map<String, String> deleteBatch(@PathVariable String noticeId) {
		return this.noticeService.deleteNotice(noticeId);
	}


}
