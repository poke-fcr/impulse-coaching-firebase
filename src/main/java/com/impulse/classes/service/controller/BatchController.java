package com.impulse.classes.service.controller;

import java.util.HashMap;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.impulse.classes.service.entity.BatchEntity;
import com.impulse.classes.service.service.BatchService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/batch")
@CrossOrigin(origins =  {"http://localhost:4200", "https://impulse-coaching.web.app", "*"}, allowedHeaders = "*")
public class BatchController {

	@Autowired
	BatchService batchService;
	
	@PostMapping("/saveBatch")
	public Map<String, String> saveBatch(@RequestBody BatchEntity batch) throws ExecutionException {
		return this.batchService.saveBatch(batch);
	}
	
	@GetMapping("/getBatches")
	public List<BatchEntity> getAllBatches(){
		return this.batchService.getAllBatches();
	}
	
	@DeleteMapping("/deleteBatch/{batchId}")
	public Map<String, String> deleteBatch(@PathVariable String batchId) {
		return this.batchService.deleteBatch(batchId);
	}

	
	
}
