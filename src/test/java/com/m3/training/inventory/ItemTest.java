package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemTest {

	private Item objectUnderTest;
	
	@BeforeEach void test_TestItem_testSetup() throws Exception{
		objectUnderTest = new Item("apple", "fruit", 10);
	}



}
