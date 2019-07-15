package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	private Item objectUnderTest;
	Item item1 = new Item("apple","fruit",15);
	Item item2 = new Item("carrot","veggie",2);
	Item item3 = new Item("milk", "dairy", 6);
	Item recalledItem = new Item("uranium","illegal substance", 3);
	@BeforeEach void test_TestItem_testSetup() throws Exception{
	objectUnderTest = item1;
		
	}
	
	@Test
	void test_TestItem_constructor() {
		String expected = "fruit";
		String actual = objectUnderTest.getDescription();
		assertEquals(expected,actual);
		
	}
	
	
	@Test
	void test_TestItem_addQuantity() {
		objectUnderTest.addToQuantity(10);
		Integer expected = 25;
		Integer actual = objectUnderTest.getQuantity();
		assertEquals(expected,actual);
		
	}
	
	@Test
	void test_TestItem_getQuantity() {
		objectUnderTest.getQuantity();
		Integer expected = 15;
		Integer actual = objectUnderTest.getQuantity();
		assertEquals(expected,actual);
	}
	
	
	@Test
	void test_TestItem_decreaseQuantity() throws Exception {
		objectUnderTest.decreaseFromQuantity(10);
		Integer expected = 5;
		Integer actual = objectUnderTest.getQuantity();
		assertEquals(expected,actual);
	}
	
	
	@Test
	void test_TestItem_putOnBackorder() throws Exception {
		objectUnderTest.decreaseFromQuantity(100);
		objectUnderTest.putOnBackorder();
		Boolean actual = objectUnderTest.onBackorder;
		Boolean expected = true;
		assertEquals(expected,actual);
	}
	



}
