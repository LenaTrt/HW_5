package com.siit.j5.stringUtilityTests;

import org.junit.Assert;

import org.junit.Test;

import com.siit.j5.stringUtility.StringUtility;

public class StringWithDigitWordsAreChangedInDigits {

	@Test
	public void test() {
		//given
		 String input = "Amy has four friends.";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoDigitWordString ();
		//then
		 String correctlyNoDigitWordString = new String ("Amy has 4 friends.");
		 Assert.assertEquals(correctlyNoDigitWordString, expected);

	}

}
