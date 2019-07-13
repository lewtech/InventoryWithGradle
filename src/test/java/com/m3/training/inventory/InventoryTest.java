package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExternalResource;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.mock.*;




class InventoryTest {
	
	private Inventory objectUnderTest;
	private ExternalResource externalResource;
	@Mock
    private Inventory inventoryMock;
	private Item item1 = new Item("apple","fruit",10);
	private Item item2 = new Item("banana","fruit",10);
	private RecalledItem item3 = new RecalledItem("carrot", "vegetable", 10);
	
	
	
	
	
	@BeforeEach void test() throws Exception{
		objectUnderTest = new Inventory();
	
	}

	@Test
	void test_Inventorytest_loadItemData() {
		objectUnderTest.loadItemData();
	}
	
	@Test
	void test_Inventorytest_addItemToInventory() {
		objectUnderTest.addItemToInventory(item1);
		objectUnderTest.addItemToInventory(item1);
		System.out.println(objectUnderTest.toString());
	}
	


}
