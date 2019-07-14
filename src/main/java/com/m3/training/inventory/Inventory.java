package com.m3.training.inventory;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.util.MultidimensionalCounter.Iterator;

public class Inventory extends ArrayList implements IInventory {

	String msg;

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

	public void removeItemFromInventory(Item item) {
		java.util.Iterator<Item> itr = items.iterator();
		while (itr.hasNext()) {
			Item x = itr.next();
			if (item.getId().contentEquals(x.getId())) {
				itr.remove();
			}
		}
	}

	public void increaseQuantity(Item item, Integer quantity) {
		item.addToQuantity(quantity);
	}

	public void sellItemThroughInventory(Item item, Integer quantity) {
		if (item.onBackorder == true) {
			String msg = "cannot sell backordered items";
			throw new IllegalArgumentException(msg);
		} else if (item.recalled == true) {
			String msg = "cannot sell recalled items";
			throw new IllegalArgumentException(msg);
		} else {
			item.decreaseFromQuantity(quantity);
		}
	}

	public List<Item> getInventory() {

		return items;
	}

	// complex methods
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
			if (item.getId().contentEquals(x.getId())) {

			}
			return item.getQuantity();
		}
		return item.getQuantity();

	}

}
