package com.impulse.classes.service.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impulse.classes.service.entity.Product;
import com.impulse.classes.service.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Product product) throws ExecutionException {
		return this.productService.saveProduct(product);
	}
}
