package com.siit.j5.stringUtilityTests;

import org.junit.Assert;
import org.junit.Test;

import com.siit.j5.stringUtility.StringUtility;

public class StringWithSpaceBeforeAndAfterWordsIsNoSpaceString {

	@Test
	public void test() {
		//given
		 String input = "  three  four  ";
		 StringUtility str = new StringUtility(input);
		//when
		 String expected = str.getNoSpaceString ();
		//then
		 String correctlyNoSpaceString = new String ("threefour");
		 Assert.assertEquals(correctlyNoSpaceString, expected);

    }
}
