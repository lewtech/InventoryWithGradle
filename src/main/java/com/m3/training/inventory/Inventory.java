package com.m3.training.inventory;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class Inventory extends ArrayList implements IInventory {
	
	

	private List<Item> items = new ArrayList<Item>();


	public void loadItemData() {

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
	
	
//	public Item findItem(Item item) {
//		for (Item individualItem : items) 
//			System.out.println(item.getId() + "  " + individualItem.getId());
//			if(item.getId().contentEquals(individualItem.getId())) {
//				return individualItem;
//			}
//			return null;
//		}
		
	

	
	public void removeItemFromInventory(Item item){
		java.util.Iterator<Item> itr = items.iterator();
		while (itr.hasNext()) {
			Item x = itr.next();
			if(item.getId().contentEquals(x.getId())) {
			itr.remove();
			}
		}
	}
	
	
	
	public void increaseQuantity(Item item, Integer quantity) {
		item.addToQuantity(quantity);
		
	}


	public void decreaseQuantity(Item item, Integer quantity) throws Exception {
		item.decreaseFromQuantity(quantity);
		
	}
	
	
	public List<Item> getInventory() {
		
		
		return items;
	}
	
	
	
	
	
	//complex methods
	public void receiveShipment(Item item) {
		
	}
	
	
	public void placeItemOnRecall(Item item) {
		
	}
	
	
	public void sellItem(Item item, Integer quantity) {
		
	}
	
	

	
	@Override
	public String toString() {
		return String.format("{%s}", items);
	}





	public Integer getItemQuantity(Item item) {
		java.util.Iterator<Item> itr = items.iterator();
		while (itr.hasNext()) {
			Item x = itr.next();
			if(item.getId().contentEquals(x.getId())) {
				
			
			} return item.getQuantity();
		} return item.getQuantity();
		
		
	}
	
	



	
	
	
}
