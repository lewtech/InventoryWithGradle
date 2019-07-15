package com.m3.training.inventory;

public interface IOrder {
	void addToORders(Order order);
	Order sendOrder(Item item, Integer quantity);
}
