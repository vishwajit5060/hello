package com.resources;

import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void handleAssertions(String actualurl, String expectedurl) {
		
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actualurl, expectedurl);
	sa.assertAll();
		
		
		
		
		
	}

}
