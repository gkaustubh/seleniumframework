package pageObjectModel;

import java.security.PublicKey;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	
	//this will show only github
	
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	By tryForFree=By.xpath("//a[@id='signup_link']");
	
	

	public LoginPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	

	public WebElement enterUsername () {
		return driver.findElement(username);
		
	    }
	
	public WebElement enterPassword () {
		return driver.findElement(password);
		
	    }
    public WebElement clickLogin() {
    	return driver.findElement(login);
    	
        }
    public WebElement ClickOnTryForFree() {
    	  return driver.findElement( tryForFree);
    	  
    	 }
}
