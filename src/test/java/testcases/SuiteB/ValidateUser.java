package testcases.SuiteB;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUser {

	
	@Test
	public void Validate() {
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("ABC", "ABC");//PASS
		softAssert.assertEquals("ABC", "DF");//Fail
		softAssert.assertEquals("ABC", "DEF");//Fail
	//	softAssert.assertTrue(5>12, "Error");//Fail
		
		softAssert.assertAll();
		//softAssert.fail("fail my validate test case");
	}
	
	@Test
	public void makefaillist() {
		Assert.fail("making a fail test");
	}
}
