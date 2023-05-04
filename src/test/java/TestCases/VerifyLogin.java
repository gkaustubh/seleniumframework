package TestCases;

import java.io.IOException;

import org.apache.commons.math3.genetics.ListPopulation;
import org.testng.annotations.Test;

import Resources.project1;
import pageObjectModel.LoginPageObjects;



public class VerifyLogin extends project1 {
	
	
	
	@Test
	public void login() throws IOException {
		
	  
	
	  
	  LoginPageObjects LPO=new LoginPageObjects(driver);
	  
	 
	  LPO.enterUsername().sendKeys("Rahul");
	  LPO.enterPassword().sendKeys("123");
	  LPO.clickLogin().click();  
	  	
	}
	

}
