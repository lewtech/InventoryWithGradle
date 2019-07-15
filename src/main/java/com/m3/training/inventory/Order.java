package com.m3.training.inventory;

public class Order {
	Item item;
	Integer quantity;
	
	Order(Item item, Integer quantity){
		this.item = item;
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Item getRecalledItem() {
		return item;
	}
	
	public Item getBackorderedItem() {
		return item;
	}
	
	public Order sendOrder(Item item, Integer quantity) {
		Order order = new Order(item, quantity);
		return order;
		
	}

	

}
