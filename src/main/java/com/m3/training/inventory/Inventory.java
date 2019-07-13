package com.m3.training.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements IInventory{
	Item item1;
	
	public static void main(String[] args) {

	}

	private List<Item> items = new ArrayList<>();

	//setup
	public void loadItemData() {
		Item item1 = new Item("apple","fruit",10);
		Item item2 = new Item("banana","fruit",10);
		RecalledItem item3 = new RecalledItem("carrot", "vegetable", 10);
	}
	
	
	public void loadItemDataFromSQL() {
		
	}
	
	
	public void loadItemDataFromLocal() {
		
	}
	
	
	public void processOrders() {
		
	}
	
	
	public void generateOrders() {
		
	}
	
	
	// atomic methods
	public void addItemToInventory(Item item) {
		items.add(item);
	}

	
	public void removeItemFromInventory(Item item){ 
		
	}
	
	
	public void increaseQuantity(Item item, Integer quantity) {
		// TODO Auto-generated method stub
		
	}


	public void decreaseQuantity(Item item, Integer quantity) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//complex methods
	public void receiveShipment(Item item) {
		
	}
	
	
	public void placeItemOnRecall(Item item) {
		
	}
	
	
	public void sellItem(Item item, Integer quantity) {
		
	}
	
	
	public void removeItem(Item item) {
		
	}



	
	
	
}
