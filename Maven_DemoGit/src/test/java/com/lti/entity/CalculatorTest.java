package com.lti.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

Calculator c =new Calculator();
	
	//@Disabled
	@Test
	public void testAdd()
	{	
		int r=c.add(100,200);
		Assertions.assertEquals(300,r,"checked add method");
	}
	
	@Test
	public void testAssertFalse()
	{
		Assertions.assertEquals("Hello", "Hello");
		Assertions.assertFalse("Vaibhav".length()==3);
		Assertions.assertFalse(10>20,"10 is not greater than 20");//this message at end is optional
	}
	
	@Test
	public void testAssertNull()
	{
		String s1=null;
		String s2="abc";
		
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	
	@Test
	public void testArrayList()
	{
		ArrayList<Integer> myList=new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
		
	}

}
