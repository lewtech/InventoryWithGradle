package com.m3.training.inventory;

import org.junit.rules.ExternalResource;
import org.mockito.Mock;

public class DriverTemp {

	public static void main(String[] args) {
		
		Inventory objectUnderTest;
		ExternalResource externalResource;
		Inventory inventory = new Inventory();
		
		Item item1 = new Item("apple","fruit",1);
		Item item2 = new Item("banana","fruit",2);
		RecalledItem item3 = new RecalledItem("carrot", "vegetable", 10);
		inventory.addItemToInventory(item1);
		inventory.addItemToInventory(item2);
		System.out.println(inventory.toString());

	}

}
