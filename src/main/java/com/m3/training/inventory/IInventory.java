package com.m3.training.inventory;

public interface IInventory {

	public void loadItemData();
//	public void loadItemDataFromSQL();
//	public void loadItemDataFromLocal();
	public void generateOrders();
	public void processOrders();

	
	// atomic methods
	void addItemToInventory(Item item);
	void removeItemFromInventory(Item item);
	void increaseQuantity(Item item, Integer quantity);
	void decreaseQuantity(Item item, Integer quantity);
	
	
	//complex methods
	void receiveShipment(Item item);
	void placeItemOnRecall(Item item);
	void sellItem(Item item, Integer quantity);
	void removeItem(Item item);
}
