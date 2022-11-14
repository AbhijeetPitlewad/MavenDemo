package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class CalculatorTest {
	
	Calculator c= new Calculator();
	
	@Disabled
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());
	}
	
	@Test
	public void testAdd() {
		   //msg comes only if test case fails
		Assertions.assertEquals(100, c.add(60,40),"check code again");
	}
	
	@Test
	void testAssertFalse() {
		
		Assertions.assertTrue("Abhi".length()==4); //pass: cause expecting true
		Assertions.assertFalse("Abhi".length()==10); //pass: cause expecting false
		Assertions.assertNotEquals("Hello","hello"); //pass
	}
	
	@Test
	void testAssertNull() {
		String str1=null;
		String str2="abcd";
		
		Assertions.assertNull(str1);//pass
		Assertions.assertNull(str2);//fail
		Assertions.assertNotNull(str1);//pass
	}
	
	@Test
	public void testArrayList() {
		ArrayList<Integer> myList= new ArrayList();
		Assertions.assertEquals(0,myList.size());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());
		
	}

}
