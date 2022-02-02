package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import dataprovider.Xls_Reader;

public class Testdataprovider {

	@DataProvider
	public static Object[][] getData(Method m) {
		Object[][] data=null;
		Object[][] data1=null;
		
		System.out.println("Method / Test  "+m.getName());
		//data=new Object[3][4];
		
		if(m.getName().equals("createUser")) {
			
			/*
			 * //row1 data[0][0]="user1-Akash"; data[0][1]="pass1";
			 * data[0][2]="abc@gmail.com"; data[0][3]="india";
			 * 
			 * //row2 data[1][0]="user2"; data[1][1]="pass2"; data[1][2]="abcdef@gmail.com";
			 * data[1][3]="canada";
			 * 
			 * //row3 data[2][0]="user3"; data[2][1]="pass3";
			 * data[2][2]="abcadasd@gmail.com"; data[2][3]="usa";
			 */
			
			Xls_Reader xl=new Xls_Reader("NikulTest.xlsx");
			int rowNumer=xl.getRowCount("Data4")+1;
			int colNumber=xl.getColumnCount("Data4");
			int j;
			  data1 = new String[rowNumer][colNumber];
			  System.out.println("Length of Array : "+data1.length);
			  for(int i=2;i<data1.length;i++) {
			    for( j=0;j<colNumber;j++) {
				    data1[i][j]=xl.getCellData("Data4",j,i);   
				  }
			  
		      }
			return data1;
		}
		else if (m.getName().equals("deleteUser")) {
			
			data=new Object[3][4];
			//row1
			data[0][0]="duser1";
			data[0][1]="dpass1";
			data[0][2]="dabc@gmail.com";
			data[0][3]="dindia";
			
			//row2
			data[1][0]="duser2";
			data[1][1]="dpass2";
			data[1][2]="dabcdef@gmail.com";
			data[1][3]="dcanada";
					
			//row3
			data[2][0]="duser3";
			data[2][1]="dpass3";
			data[2][2]="dabcadasd@gmail.com";
			data[2][3]="dusa";
		}
		
		
	
		
		return data;
	}
	
}
