package com.impulse.classes.service.entity;

public class Product {

	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Product() {
		super();
	}
	public Product(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
}
