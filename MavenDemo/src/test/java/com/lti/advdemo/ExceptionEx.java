package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExceptionEx {
	
	@Disabled
	@Test
    void testExpection() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("100");
        });
    }//fail: expecting Exception but not getting Exception

	
	@Test
    void testException1() {

       Calculator c= new Calculator();
        
        final Exception e = assertThrows(ArithmeticException.class, () -> {
            c.searchEmpId(120);      
      });        
        
      Assertions.assertEquals("u enetered zero",e.getMessage());
    }  //Fail: Expecting Expetion but No Exception
	
}
