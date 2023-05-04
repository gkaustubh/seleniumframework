package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	
	public WebDriver driver;
	
  private  By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname= By.xpath("//input[@name='UserLastName']");
	By workmail=By.xpath("//input[@name='UserEmail']");
	By jobtitle=By.xpath("//select[@name='UserTitle']");
	
	By companyname = By.xpath("//input[@name='CompanyName']");

	By companyemployee = By.xpath("//select[@name='CompanyEmployees']");

	By phone = By.xpath("//input[@name='UserPhone']");

    By countryregion = By.xpath("//select[@name='CompanyCountry']");

	By agreecheckbox = By.xpath("(//div[@class='checkbox-ui'])[1]");
	  
	
	 public SignUpPageObjects(WebDriver driver2) {
		 this.driver=driver2;
		 
		// TODO Auto-generated constructor stub
	}

	public WebElement firstname() {
		    return driver.findElement(firstname);
		  }
		  
		  public WebElement lastname() {
		    return driver.findElement(lastname);
		  }
		  public WebElement workemail() {
		    return driver.findElement(workmail);
		  }
		  public WebElement jobtitle() {
		    return driver.findElement(jobtitle);
		  }
		  public WebElement companyname() {
		    return driver.findElement(companyname);
		  }
		  public WebElement companyemployee() {
		    return driver.findElement(companyemployee);
		    
		  }public WebElement phonenumber() {
		    return driver.findElement(phone);
		    
		  }public WebElement region() {
		    return driver.findElement(countryregion);
		    
		  }public WebElement checkbox() {
		    return driver.findElement(agreecheckbox);
		  } 

}
