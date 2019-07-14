package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	private Item objectUnderTest;
	Item item1 = new Item("apple","fruit",1);
	Item item2 = new Item("carrot","veggie",2);
	Item item3 = new Item("milk", "dairy", 6);
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
		Integer expected = 11;
		Integer actual = objectUnderTest.getQuantity();
		assertEquals(expected,actual);
		
	}
	
	@Test
	void test_TestItem_getQuantity() {
		objectUnderTest.getQuantity();
		Integer expected = 1;
		Integer actual = objectUnderTest.getQuantity();
		assertEquals(expected,actual);
	}
	
	
	@Test
	void test_TestItem_decreaseQuantity() {
		objectUnderTest.decreaseFromQuantity(1);
		Integer expected = 0;
		Integer actual = objectUnderTest.getQuantity();
		assertEquals(expected,actual);
		
	}



}
