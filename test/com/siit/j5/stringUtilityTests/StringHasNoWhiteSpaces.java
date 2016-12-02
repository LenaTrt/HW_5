package com.siit.j5.stringUtilityTests;


import org.junit.Assert;
import org.junit.Test;

import com.siit.j5.stringUtility.StringUtility;

public class StringHasNoWhiteSpaces {

	@Test
	public void test() {
		//given
		 String input = "Amyhasfourfriends.";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoSpaceString ();
		//then
		String correctlyNoSpaceString = new String ("Amyhasfourfriends.");
		Assert.assertEquals(correctlyNoSpaceString, expected);
		
	}

}
