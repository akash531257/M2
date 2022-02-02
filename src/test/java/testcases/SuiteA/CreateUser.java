package testcases.SuiteA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateUser {
//step 2 linking
	@Test(dataProviderClass =dataprovider.Testdataprovider.class,dataProvider = "getData")//step 2 map the data provider
	public void createUser(String user,String pass) { //step 3 define parameter
		System.out.println(user+"------"+pass+"-----");
	}
	
	@Test(dataProviderClass =dataprovider.Testdataprovider.class,dataProvider = "getData")//step 2 map the data provider
	public void deleteUser(String user,String pass,String email,String country) { //step 3 define parameter
		System.out.println(user+"------"+pass+"-----" +email+" ----- "+country);
	}
	//step-1
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][4];
		
		//row1
		data[0][0]="user1-akash";
		data[0][1]="pass1";
		data[0][2]="abc@gmail.com";
		data[0][3]="india";
		
		//row2
		data[1][0]="user2";
		data[1][1]="pass2";
		data[1][2]="abcdef@gmail.com";
		data[1][3]="canada";
				
		//row3
		data[2][0]="user3";
		data[2][1]="pass3";
		data[2][2]="abcadasd@gmail.com";
		data[2][3]="usa";
	
		
		return data;
	}
	
}
