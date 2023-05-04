package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.project1;
import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignUpPageObjects;
import pageObjectModel.common;

public class VerifySignup {
	
	
	public class Verifysignup extends project1{
		 
		 @Test
		 public void signup() throws IOException, InterruptedException{
		  
		  
		  
		  LoginPageObjects LPO=new LoginPageObjects(driver);
		  
		  LPO.ClickOnTryForFree().click();
		  
		  SignUpPageObjects SPO=new SignUpPageObjects(driver);
		  Thread.sleep(5000);
		  
		  SPO.firstname().sendKeys("hello");
		  SPO.lastname().sendKeys("helo");
		  Thread.sleep(3000);
		  common.commonselect(SPO.companyemployee(),2);
		 }
		  
		  
	
	}
	
}

		  
		  
		
		  
		 
		  
		  
	 
		 


