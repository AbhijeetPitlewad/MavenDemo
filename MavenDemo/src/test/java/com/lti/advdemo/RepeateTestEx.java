package com.lti.advdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class RepeateTestEx {

		@DisplayName("Repeat the test for 5 times")
		@RepeatedTest(5)
		public void shouldRepeat() {
			int a=10,b=20;
			Assertions.assertEquals(200, (a*b),"should rpeat test- passed");
		}
}

