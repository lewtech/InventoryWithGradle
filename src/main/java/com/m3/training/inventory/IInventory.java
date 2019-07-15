package com.m3.training.inventory;

public interface IInventory {


	
	// atomic methods
	void addItemToInventory(Item item);
	void removeItemFromInventory(Item item);
	void increaseQuantity(Item item, Integer quantity);
	void sellItemThroughInventory(Item item, Integer quantity) throws Exception;
	
	
	//complex methods
	void receiveShipment(Item item, Integer quantity);
	void placeItemOnRecall(Item item);

	
}
