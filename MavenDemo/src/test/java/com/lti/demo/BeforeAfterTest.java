package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {

	Calculator c= new Calculator();
	int sum;
	
	@BeforeAll
	public static void testDbConn() {
		System.out.println("DB connection is up");
	}
	
	@BeforeEach
	public void testStartup() {
		sum=500;
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void testCleanup() {
		sum=0;
		System.out.println("clean up");
	}
	
	@AfterAll
	public static void testBBclose() {
		
		System.out.println("DB Closed");
	}
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("hello", c.sayHello());
		System.out.println("testsayHello()");
	}
	
	@Test
	public void testAdd() {
		   //msg comes only if test case fails
		Assertions.assertEquals(100, c.add(60,40),"check code again");
		System.out.println("testAdd()");
	}
	
	
}
