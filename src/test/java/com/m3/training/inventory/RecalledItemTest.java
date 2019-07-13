package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecalledItemTest {

	private RecalledItem objectUnderTest;
	
	@BeforeEach void test_TestRecalledItem_testSetup() throws Exception{
		objectUnderTest = new RecalledItem("Apple","a fruit", 5);
	}



}
