package com.m3.training.inventory;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
	Item item;
	Integer quantity;
	private List<Order> orders = new ArrayList<Order>();
	
	
	Order(Item item, Integer quantity){
		this.item = item;
		this.quantity = quantity;
	}
	
	public void addToORders(Order order) {
		orders.add(order);
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
