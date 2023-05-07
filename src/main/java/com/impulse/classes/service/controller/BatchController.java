package com.impulse.classes.service.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impulse.classes.service.entity.BatchEntity;
import com.impulse.classes.service.service.BatchService;

@RestController
@RequestMapping("/batch")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BatchController {

	@Autowired
	BatchService batchService;
	
	@PostMapping("/saveBatch")
	public String saveBatch(@RequestBody BatchEntity batch) throws ExecutionException {
		return this.batchService.saveBatch(batch);
	}
	
	@GetMapping("/getBatches")
	public List<BatchEntity> getAllBatches(){
		return this.batchService.getAllBatches();
	}
	
}
