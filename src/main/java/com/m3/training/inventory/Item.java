package com.m3.training.inventory;

public class Item implements IItem {
	private static final Exception IllegalArgumentException = null;
	public String id;
	public String description;
	public Integer quantity;
	public boolean recalled;
	public boolean available;
	public Integer refillThreshold;
	public Integer refillAmount;
	public boolean onBackorder;

	public Item(String id, String description, Integer quantity) {

		this.id = id;
		this.description = description;
		this.quantity = quantity;
		recalled = false;
		available = true;
		refillThreshold = 10;
		refillAmount = 10;
		onBackorder = false;
	}

	@Override
	public String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	@Override
	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	@Override
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

	public Integer addToQuantity(Integer amount) {
		quantity = quantity + amount;
		return quantity;
	}

	@Override
	public String toString() {
		return String.format("{%s, %s, %s}", id, description, quantity);
	}

	public Integer decreaseFromQuantity(Integer amount) {

		quantity = quantity - amount;
		return quantity;

	}

	public void putOnBackorder() {
		onBackorder = true;
		available = false;
	}

	public Boolean getIsRecalled() {
		
		return isRecalled();
	}
	
	public Boolean getOnBackordered() {
		return onBackorder;
	}
}
