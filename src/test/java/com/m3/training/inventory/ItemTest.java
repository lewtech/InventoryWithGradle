package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	private Item objectUnderTest;
	
	@BeforeEach void test_TestItem_testSetup() throws Exception{
		objectUnderTest = new Item("apple", "new",15 );
		
	}
	
	@Test
	void test_TestItem_constructor() {
		objectUnderTest = new Item("carrot", "veggie",5);
		String expected = "veggie";
		String actual = objectUnderTest.getDescription();
		assertEquals(expected,actual);
		
	}



}
