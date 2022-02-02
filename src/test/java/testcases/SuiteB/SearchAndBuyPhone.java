package testcases.SuiteB;

import javax.naming.Context;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {

	boolean flag=false; //read from json , xl files
	
	@Test(priority = 1)
	
	 ///if it is failing yoou cant select and checkout..so it depends on methods
	public void search(ITestContext context) { 
		if(flag)
		throw new SkipException("Skipping Test");
		
		System.out.println("Search a Phone");
		context.setAttribute("phoneName", "IPHONE14");
	}
	@Test(priority = 2,dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context) {
		System.out.println("Selecting Phone");
		String selectedPhone=(String) context.getAttribute("phoneName");
		System.out.println(selectedPhone);
	}
	
	@Test(priority = 3,dependsOnMethods = {"search","selectPhone"})
	public void checkout() {
		System.out.println("Chckout");
	}
}
