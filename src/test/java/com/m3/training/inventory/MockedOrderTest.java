package com.m3.training.inventory;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.meta.When;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.mock.*;




class MockedOrderTest {
	
	Order mock;
	

	@Before
	public void init() {
	    MockitoAnnotations.initMocks(this);
	}
	
	@Mock
	Order order = Mockito.mock(Order.class);
	
	Item item1 = new Item("apple", "fruit", 1);
	Item item2 = new Item("carrot", "veggie", 2);
	Item item3 = new Item("milk", "dairy", 6);
	Item recalledItem = new Item("uranium", "illegal substance", 3);
	Item backOrderItem = new Item("fidgetspinners", "gadget", 3);
	
    
	@Test
	void test_MockedOrderTest_testGetItem() {
    	Mockito.when(order.getItem()).thenReturn(item1);
		Item expected = item1;
		Item actual = order.getItem();
		assertEquals(expected,actual);
	}
	
	
	void test_MockedOrderTest_testGetRecalledItem() {
    	Mockito.when(order.getRecalledItem()).thenReturn(recalledItem);
		Item expected = recalledItem;
		Item actual = order.getRecalledItem();
		assertEquals(expected,actual);
	}
	
	
	void test_MockedORderTest_getBackOrderItem() {
    	Mockito.when(order.getBackorderedItem()).thenReturn(backOrderItem);
		Item expected = backOrderItem;
		Item actual = order.getBackorderedItem();
		assertEquals(expected,actual);
	}





}
