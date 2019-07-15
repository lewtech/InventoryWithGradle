package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.mock.*;

class InventoryTest {

	private Inventory objectUnderTest;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Mock
	private Inventory inventoryMock;

	Item item1 = new Item("apple", "fruit", 1);
	Item item2 = new Item("carrot", "veggie", 2);
	Item item3 = new Item("milk", "dairy", 6);
	Item recalledItem = new Item("uranium", "illegal substance", 3);
	Item backOrderItem = new Item("fidgetspinners", "gadget", 3);

	@BeforeEach
	void test() throws Exception {
		objectUnderTest = new Inventory();
	}

	@Test
	void test_InventoryTest_getInventory() {
		objectUnderTest.addItemToInventory(item1);
		objectUnderTest.addItemToInventory(item2);
		objectUnderTest.addItemToInventory(item3);
		List<Item> actual = objectUnderTest.getInventory();
		List<Item> expected = new ArrayList<Item>();
		expected.add(item1);
		expected.add(item2);
		expected.add(item3);
		assertEquals(expected, actual);
	}

	@Test
	void test_Inventorytest_addItemToInventory() {
		objectUnderTest.addItemToInventory(item1);
		List<Item> actual = objectUnderTest.getInventory();
		List<Item> expected = new ArrayList<Item>();
		expected.add(item1);
		assertEquals(expected, actual);
	}

	@Test
	void test_Inventorytest_add2ItemsToInventory() {
		objectUnderTest.addItemToInventory(item1);
		objectUnderTest.addItemToInventory(item2);
		List<Item> actual = objectUnderTest.getInventory();
		List<Item> expected = new ArrayList<Item>();
		expected.add(item1);
		expected.add(item2);
		assertEquals(expected, actual);
	}

	@Test
	void test_Inventorytest_add3ItemsToInventory() {
		objectUnderTest.addItemToInventory(item1);
		objectUnderTest.addItemToInventory(item2);
		objectUnderTest.addItemToInventory(item3);
		List<Item> actual = objectUnderTest.getInventory();
		List<Item> expected = new ArrayList<Item>();
		expected.add(item1);
		expected.add(item2);
		expected.add(item3);
		assertEquals(expected, actual);
	}

	@Test
	void test_InventoryTest_removeItem() {
		objectUnderTest.addItemToInventory(item1);
		objectUnderTest.addItemToInventory(item2);
		objectUnderTest.addItemToInventory(item3);
		objectUnderTest.removeItemFromInventory(item3);

		List<Item> actual = objectUnderTest.getInventory();
		List<Item> expected = new ArrayList<Item>();
		expected.add(item1);
		expected.add(item2);
		assertEquals(expected, actual);
	}

	@Test
	void test_InventoryTest_getQuantityFromList() {
		objectUnderTest.getItemQuantity(item2);
		Integer expected = 2;
		Integer actual = objectUnderTest.getItemQuantity(item2);
		assertEquals(expected, actual);
	}

	@Test
	void test_InventoryTest_increaseQuantity() {
		objectUnderTest.increaseQuantity(item1, 10);
		Integer expected = 11;
		Integer actual = objectUnderTest.getItemQuantity(item1);

		assertEquals(expected, actual);
	}

	@Test
	void test_InventoryTest_decreaseQuantity() throws Exception {
		objectUnderTest.sellItemThroughInventory(item1, 1);
		Integer expected = 0;
		Integer actual = objectUnderTest.getItemQuantity(item1);
		assertEquals(expected, actual);
	}

	@Test
	void test_InventoryTest_sellItem() throws Exception {
		objectUnderTest.sellItemThroughInventory(item3, 2);
		Integer expected = 4;
		Integer actual = item3.getQuantity();
		assertEquals(expected, actual);
	}

	@Test
	public void test_InventoryTest_sellBackorderItemFail() {
		backOrderItem.onBackorder = true;
		try {
			objectUnderTest.sellItemThroughInventory(backOrderItem, 2);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("cannot sell backordered items", e.getMessage());
		}
	}

	@Test
	void test_InventoryTest_sellItemOnRecallFail() {
		recalledItem.setRecalled(true);
		try {
			objectUnderTest.sellItemThroughInventory(recalledItem, 2);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("cannot sell recalled items", e.getMessage());
		}
	}

	// complex

	@Test
	void test_InventoryTest_receiveShipment() {
		Integer expected = item3.quantity +20;
		objectUnderTest.increaseQuantity(item3, 20);
		Integer actual = item3.quantity;
		assertEquals(expected,actual);
	}
	
	
	@Test
	void test_InventoryTest_overbuyItem() {
		Integer expected = item3.quantity +20;
		objectUnderTest.increaseQuantity(item3, 20);
		Integer actual = item3.quantity;
		assertEquals(expected,actual);
	}
	
	

	@Test
	void test_InventoryTest_placeItemOnRecall() {
		
	}

	// LOAD DATA

	@Test
	void test_InventoryTest_loadItemData() {

	}

	@Test
	void test_InventoryTest_loadItemDataFromSQL() {

	}

	@Test
	void test_InventoryTest_loadItemDataFromLocal() {

	}

	@Test
	void test_InventoryTest_processOrders() {

	}

	@Test
	void test_InventoryTest_generateOrders() {

	}

}
