package com.m3.training.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends ArrayList implements IInventory {

	String msg;

	private List<Item> items = new ArrayList<Item>();
	private List<Item> recalledItems = new ArrayList<Item>();


	// atomic methods
	@Override
	public void addItemToInventory(Item item) {
		items.add(item);
	}

	@Override
	public void removeItemFromInventory(Item item) {
		java.util.Iterator<Item> itr = items.iterator();
		while (itr.hasNext()) {
			Item x = itr.next();
			if (item.getId().contentEquals(x.getId())) {
				itr.remove();
			}
		}
	}

	@Override
	public void increaseQuantity(Item item, Integer quantity) {
		item.addToQuantity(quantity);
	}



	public List<Item> getInventory() {
		return items;
	}

	// complex methods
	@Override
	public void receiveShipment(Item item, Integer quantity) {
		item.addToQuantity(quantity);
		
	}

	@Override
	public void placeItemOnRecall(Item item) {
		item.setRecalled(true);
	}


	
	@Override
	public void sellItemThroughInventory(Item item, Integer quantity) {
		if (item.onBackorder == true) {
			String msg = "cannot sell backordered items";
			throw new IllegalArgumentException(msg);
		} else if (item.recalled == true) {
			String msg = "cannot sell recalled items";
			throw new IllegalArgumentException(msg);
		} else if (item.getQuantity() < quantity){
			Integer overBuyAmount = -item.getQuantity()+quantity;
			item.putOnBackorder();
			item.decreaseFromQuantity(quantity);
			createBackorder(item, overBuyAmount);
		} else {
			item.decreaseFromQuantity(quantity);
		}
	}

	private void createBackorder(Item item, Integer overBuyAmount) {
		// GENERATE BACKORDER ORDER MOCKITO STUB
		
	}

	@Override
	public String toString() {
		return String.format("{%s}", items);
	}

	public Integer getItemQuantity(Item item) {
		java.util.Iterator<Item> itr = items.iterator();
		while (itr.hasNext()) {
			Item x = itr.next();
			if (item.getId().contentEquals(x.getId())) {

			}
			return item.getQuantity();
		}
		return item.getQuantity();

	}





}
