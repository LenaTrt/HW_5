package com.siit.j5.stringUtilityTests;

import org.junit.Assert;

import org.junit.Test;

import com.siit.j5.stringUtility.StringUtility;

public class StringWithUpperAndLowerCaseChanged {

	@Test
	public void test() {
		//given
		 String input = "Amy has FOUr friends and TWO cats";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoDigitWordString ();
		//then
		 String correctlyNoDigitWordString = new String ("Amy has 4 friends and 2 cats");
		 Assert.assertEquals(correctlyNoDigitWordString, expected);

	}

}
