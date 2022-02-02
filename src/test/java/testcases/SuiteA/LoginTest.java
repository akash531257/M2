package testcases.SuiteA;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	
	@BeforeTest 
	public void initialize() {
		System.out.println("--------@beforetest---------");//example..start browsr,,load site,set property
	}
	
	@AfterTest
	public void quitting() {
		System.out.println("---------@aftertest---------");//close browser
	}
	
	@BeforeMethod
	public void beforemath() {
		System.out.println("------@before metho -------");//init report
	}
	@AfterMethod
	public void aftermeth() {
		System.out.println("---------@after Method--------");//finalize report
	}
	
	
	
	@Test
	public void doLogin() {
		String expectedResult="abc";
		String actualResult="abc";
		
		//Assert.assertEquals(actualResult, expectedResult);
	//	Assert.assertTrue(5>12, "5 cannot be greater than 12");
		
		System.out.println("Start");
		//Assert.assertEquals(actualResult, expectedResult);//stop the execution , we can use soft assertion
	//	Assert.fail("Actual and Expected results are not matching");
		System.out.println("End");
		
	}
	@Test
	public void logout() {
		System.out.println("Logging Out");
	}
}
