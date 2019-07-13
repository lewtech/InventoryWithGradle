package com.m3.training.inventory;

public class Item {
	private String id;
	protected static String description;
	protected static Integer quantity;
	private boolean recalled;
	private boolean available;
	private Integer refillThreshold;
	private Integer refillAmount;
	
	
	protected Item(String id, String description, Integer quantity) {
		
		this.id = id;
		this.description = description;
		this.quantity = quantity;
		recalled = false;
		available = true;
		refillThreshold = 10;
		refillAmount = 10;
	}


	public String getId() {
		return id;
	}


	private void setId(String id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	private void setDescription(String description) {
		this.description = description;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public boolean isRecalled() {
		return recalled;
	}


	public void setRecalled(boolean recalled) {
		this.recalled = recalled;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public Integer getRefillThreshold() {
		return refillThreshold;
	}


	public void setRefillThreshold(Integer refillThreshold) {
		this.refillThreshold = refillThreshold;
	}


	public Integer getRefillAmount() {
		return refillAmount;
	}


	public void setRefillAmount(Integer refillAmount) {
		this.refillAmount = refillAmount;
	}
	
	public String toString() {
		return String.format("{%s, %s, %s}", id, description, quantity);
}}
