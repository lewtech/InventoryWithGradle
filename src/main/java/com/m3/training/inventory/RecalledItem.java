package com.m3.training.inventory;

public class RecalledItem extends Item {
	Boolean recalled;
	Boolean available;
	
	public RecalledItem(String id, String description, Integer quantity ) {
		super(id, description, quantity);
		recalled = true;
		available = false;
		
	}
	
	public boolean getRecalled() {
		return recalled;
	}

}
